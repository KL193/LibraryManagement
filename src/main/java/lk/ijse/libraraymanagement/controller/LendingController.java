package lk.ijse.libraraymanagement.controller;

import lk.ijse.libraraymanagement.dto.LendingDTO;
import lk.ijse.libraraymanagement.service.LendingService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/lending")
@RequiredArgsConstructor
public class LendingController {

    private final LendingService lendingService;
    @PostMapping
    public ResponseEntity<Void> addLending(@RequestBody LendingDTO lendingDTO){
        lendingService.addLending(lendingDTO);
        return ResponseEntity.ok().build();
    }
    @PatchMapping("/{lendingId}")
    public ResponseEntity<Void> handoverBook(@PathVariable String lendingId){
        lendingService.handOverLending(lendingId);
        return ResponseEntity.noContent().build();
    }
    @DeleteMapping("/{lendingId}")
    public ResponseEntity<Void> deleteLending(@PathVariable String lendingId){
        return ResponseEntity.noContent().build();
    }
    @GetMapping ("/{lendingId}")
    public ResponseEntity<LendingDTO> getSpecificLending(@PathVariable String lendingId){
        lendingService.getSpecificLending(lendingId);
        return ResponseEntity.ok().body(lendingService.getSpecificLending(lendingId));
    }
    @GetMapping
    public ResponseEntity<List<LendingDTO>> getAllLending(){
        lendingService.getAllLendings();
        return ResponseEntity.ok().body(lendingService.getAllLendings());
    }
}
