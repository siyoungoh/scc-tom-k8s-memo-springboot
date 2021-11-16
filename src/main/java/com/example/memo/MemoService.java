package com.example.memo;

import java.util.List;

import lombok.AllArgsConstructor;

import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class MemoService {

	private final MemoRepository memoRepository;

	public void saveMemo(MemoDto memoDto) {
		memoRepository.save(new Memo(memoDto));
	}

	public List<Memo> getMemo() {
		return memoRepository.findAll();
	}
}
