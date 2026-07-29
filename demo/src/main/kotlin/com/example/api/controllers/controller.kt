package com.example.demo.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class SyncControllers(private val syncService: SyncService) {
    @GetMapping("/sync")
    fun syncContent(){return syncService.sync()}

}