package gg.fifa.backend.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.http.ResponseEntity

@RestController
@RequestMapping("/api")
class FifaGGController {

    @GetMapping("/playersInfoByPosition/{positionID}")
    fun getPlayersInfoByPosition(@PathVariable positionID: String): ResponseEntity<String> {
        return ResponseEntity.ok("Success for $positionID")
    }

    @GetMapping("/playerDetailInfo/{playerID}")
    fun getPlayerDetailInfo(@PathVariable playerID: String): ResponseEntity<String> {
        return ResponseEntity.ok("Success for $playerID")
    }

}