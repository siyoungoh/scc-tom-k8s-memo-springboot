package com.example.memo;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class MemoService {

    private final MemoRepository memoRepository;

    public void saveMemo(MemoDto memoDto){
        memoRepository.save(new Memo(memoDto));
    }
}
