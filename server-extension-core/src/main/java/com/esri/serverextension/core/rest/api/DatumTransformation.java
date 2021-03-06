/*
 * Copyright (c) 2017 Esri
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.​
 */

package com.esri.serverextension.core.rest.api;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.List;

/**
 * kyunam_kim@esri.com on 1/5/17.
 */
@XmlRootElement
@JsonIgnoreProperties(ignoreUnknown = true)
public class DatumTransformation implements Serializable {

  private static final long serialVersionUID = 1L;

  private List<Transformation> geoTransforms;

  public List<Transformation> getGeoTransforms() {
    return geoTransforms;
  }

  public void setGeoTransforms(List<Transformation> geoTransforms) {
    this.geoTransforms = geoTransforms;
  }
}
