/**
 * Copyright © 2017 Sven Ruppert (sven.ruppert@gmail.com)
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
package org.rapidpm.vaadin.v10.tb.demo.views;

import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.router.Route;
import org.rapidpm.dependencies.core.logger.HasLogger;
import org.rapidpm.vaadin.v10.tb.demo.MainLayout;

import static org.rapidpm.vaadin.v10.tb.demo.views.RoleBView.NAV_ROLE_B_VIEW;

@Route(NAV_ROLE_B_VIEW)
public class RoleBView extends MainLayout implements HasLogger {

  public static final String NAV_ROLE_B_VIEW = "role-b";

  public RoleBView() {
    super();
    logger().info("customizing now the Role B ui content..");
    middle().add(new Span("I am now the Role B View..  add Content here"));
  }

}
