package com.dao.service;

import com.dao.bean.MusicSongs;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author:wq
 * @Date: 2022/11/18
 * @Description:
 */
public interface OperatorMusicService {

    /**
     *
     * @param size
     * @return
     */
    List<MusicSongs> selectAllMusicBySize(int size);
}
