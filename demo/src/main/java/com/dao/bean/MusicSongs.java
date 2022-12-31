package com.dao.bean;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;

/**
 * (MusicSongs)表实体类
 *
 * @author makejava
 * @since 2022-11-18 09:56:05
 */
@Data
@TableName(value = "music_songs")
public class MusicSongs {

    @TableId(value = "id")//指定自增策略
    private String id;

    private String songName;

    private String songData;

    private String songPlayPic;

    private String songPic;

    private String songWriter;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String getSongData() {
        return songData;
    }

    public void setSongData(String songData) {
        this.songData = songData;
    }

    public String getSongPlayPic() {
        return songPlayPic;
    }

    public void setSongPlayPic(String songPlayPic) {
        this.songPlayPic = songPlayPic;
    }

    public String getSongPic() {
        return songPic;
    }

    public void setSongPic(String songPic) {
        this.songPic = songPic;
    }

    public String getSongWriter() {
        return songWriter;
    }

    public void setSongWriter(String songWriter) {
        this.songWriter = songWriter;
    }
}


