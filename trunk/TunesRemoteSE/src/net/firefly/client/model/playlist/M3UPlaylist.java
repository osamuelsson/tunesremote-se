/*
 * This file is part of FireflyClient.
 *
 * FireflyClient is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 3 of the License, or
 * any later version.
 *
 * FireflyClient is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with FireflyClient; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301  USA
 * 
 * Copyright 2007 Vincent Cariven
 */
package net.firefly.client.model.playlist;

import net.firefly.client.model.data.list.SongList;
import net.firefly.client.model.data.list.SortedSongList;

public class M3UPlaylist extends AbstractPlaylist {

	public M3UPlaylist(SongList parentLibrarySongList, boolean sort) {
		super(parentLibrarySongList);
		if (sort){
			this.songList = new SortedSongList();
		} else {
			this.songList = new SongList();
		}
	}

	public String getPlaylistSpec() {
		return null;
	}

	public PlaylistType getPlaylistType() {
		return PlaylistType.STATIC_M3U;
	}
}
