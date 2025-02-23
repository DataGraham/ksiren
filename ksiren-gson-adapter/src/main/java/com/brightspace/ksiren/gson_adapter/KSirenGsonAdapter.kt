package com.brightspace.ksiren.gson_adapter

import com.brightspace.ksiren.KSirenException
import com.brightspace.ksiren.KSirenJsonReader
import com.google.gson.stream.JsonReader

/**
 * Copyright 2017 D2L Corporation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
class KSirenGsonAdapter(val gsonReader: JsonReader) : KSirenJsonReader() {
	override fun beginObject() {
		gsonReader.beginObject()
	}

	override fun endObject() {
		gsonReader.endObject()
	}

	override fun beginArray() {
		gsonReader.beginArray()
	}

	override fun endArray() {
		gsonReader.endArray()
	}

	override fun hasNext(): Boolean {
		return gsonReader.hasNext()
	}

	override fun nextName(): String {
		return gsonReader.nextName()
	}

	override fun nextStringImpl(): String {
		return gsonReader.nextString()
	}

	override fun nextBoolean(): Boolean {
		return gsonReader.nextBoolean()
	}

	override fun nextNull() {
		gsonReader.nextNull()
	}
}
