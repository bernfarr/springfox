/*
 *
 *  Copyright 2015 the original author or authors.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 *
 */

package springfox.gradlebuild.version

abstract class VersionDecorator implements SoftwareVersion {
  protected SoftwareVersion delegate

  VersionDecorator(SoftwareVersion delegate) {
    this.delegate = delegate
  }

  @Override
  void save(File propFile) {
    delegate.save(propFile)
  }

  @Override
  SoftwareVersion next(ReleaseType releaseType) {
    return delegate.next(releaseType)
  }

  @Override
  String asText() {
    return delegate.asText()
  }

  @Override
  int getMajor() {
    return delegate.major
  }

  @Override
  int getMinor() {
    return delegate.minor
  }

  @Override
  int getPatch() {
    return delegate.patch
  }


  @Override
  public String toString() {
    asText()
  }
}
