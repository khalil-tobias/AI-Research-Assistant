package com.khalil.research_ai_assistant;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping
@RestController("/api/research")
@CrossOrigin(origins = "*")
@AllArgsConstructor
public class ResearchController {
    private final ResearchService researchService;

    @PostMapping("/process")
    public ResponseEntity<String> processContent(@RequestBody ResearchRequest request)
    {
        String result = researchService.processContent(request);
        return ResponseEntity.ok(result);
    }
}
