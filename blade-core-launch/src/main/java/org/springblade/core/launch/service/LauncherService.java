/**
 * Copyright (c) 2018-2028, Chill Zhuang 庄骞 (smallchill@163.com).
 * <p>
 * Licensed under the GNU LESSER GENERAL PUBLIC LICENSE;
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.gnu.org/licenses/lgpl.html
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springblade.core.launch.service;

import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * launcher 扩展 用于一些组件发现
 *
 * @author Chill
 */
public interface LauncherService {

	/**
	 * 启动时 处理 SpringApplicationBuilder
	 *
	 * @param builder SpringApplicationBuilder
	 * @param appName SpringApplicationAppName
	 * @param profile SpringApplicationProfile
	 */
	void launcher(SpringApplicationBuilder builder, String appName, String profile);

}
