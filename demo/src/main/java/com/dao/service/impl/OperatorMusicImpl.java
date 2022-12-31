package com.dao.service.impl;

import com.dao.bean.MusicSongs;
import com.dao.service.OperatorMusicService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author:wq
 * @Date: 2022/11/18
 * @Description:
 */
@Slf4j
@Service
public class OperatorMusicImpl implements OperatorMusicService {
    /**
     * @param size
     * @return
     */
    @Override
    public List<MusicSongs> selectAllMusicBySize(int size) {
        return null;
    }
}
