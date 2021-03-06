package com.example.memo;

import java.util.List;

import lombok.AllArgsConstructor;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
class MemoController {

	private final MemoService memoService;

	@PostMapping("/memo")
	public void createMemo(@RequestBody MemoDto memoDto) {
		memoService.saveMemo(memoDto);
	}

	@GetMapping("/memo")
	public List<Memo> getMemo() {
		return memoService.getMemo();
	}
}
