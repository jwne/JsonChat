/*
 * Copyright (C) 2014 Goblom
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */

package org.goblom.jsonchat;

import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

/**
 *
 * @author Goblom
 */
class TooltipDefaults {
    
    public static void load(Plugin plugin) throws Exception {
        JSONChat.registerModifier(new ChatModifier(plugin, "name", "Show name of the player") {
            @Override
            public String onModify(Player player) {
                return player.getName();
            }
        });
        
        JSONChat.registerModifier(new ChatModifier(plugin, "uuid", "Show uuid of the player") {
            @Override
            public String onModify(Player player) {
                return player.getUniqueId().toString();
            }
        });
    }
}
