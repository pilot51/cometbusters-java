/*
 * Copyright 2021 Mark Injerd
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package network

import kotlinext.js.jsObject

/** [Original source](https://github.com/ColoredCarrot/poker-game/blob/38c8ee8b/src/main/kotlin/comm/PeerJS.kt) */
object PeerJS {
	private val PEERJS_CLOUD_INIT = jsObject<dynamic> {
		debug = 2
	}

	private var init = PEERJS_CLOUD_INIT

	fun createPeer(): dynamic {
		@Suppress("UNUSED_VARIABLE")
		val init = init
		return js("new Peer(null, init)")
	}
}
