package com.project.shopapp.entity;

import java.util.Date;

import com.project.shopapp.composite.PlaylistSongId;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "PlaylistSong")
public class PlaylistSong {

    @EmbeddedId
    private PlaylistSongId id;

    @ManyToOne
    @JoinColumn(name = "songId", insertable = false, updatable = false)
    private Song song;

    @ManyToOne
    @JoinColumn(name = "playlistId", insertable = false, updatable = false)
    private Playlist playlist;

    @Temporal(TemporalType.DATE)
    @Column(name = "Createdate")
    private Date likeDate = new Date();
}
