// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/api/v2/core/config_source.proto

package io.envoyproxy.envoy.api.v2.core;

public interface ConfigSourceOrBuilder extends
    // @@protoc_insertion_point(interface_extends:envoy.api.v2.core.ConfigSource)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Path on the filesystem to source and watch for configuration updates.
   * .. note::
   *  The path to the source must exist at config load time.
   * .. note::
   *   Envoy will only watch the file path for *moves.* This is because in general only moves
   *   are atomic. The same method of swapping files as is demonstrated in the
   *   :ref:`runtime documentation &lt;config_runtime_symbolic_link_swap&gt;` can be used here also.
   * </pre>
   *
   * <code>string path = 1;</code>
   */
  java.lang.String getPath();
  /**
   * <pre>
   * Path on the filesystem to source and watch for configuration updates.
   * .. note::
   *  The path to the source must exist at config load time.
   * .. note::
   *   Envoy will only watch the file path for *moves.* This is because in general only moves
   *   are atomic. The same method of swapping files as is demonstrated in the
   *   :ref:`runtime documentation &lt;config_runtime_symbolic_link_swap&gt;` can be used here also.
   * </pre>
   *
   * <code>string path = 1;</code>
   */
  com.google.protobuf.ByteString
      getPathBytes();

  /**
   * <pre>
   * API configuration source.
   * </pre>
   *
   * <code>.envoy.api.v2.core.ApiConfigSource api_config_source = 2;</code>
   */
  boolean hasApiConfigSource();
  /**
   * <pre>
   * API configuration source.
   * </pre>
   *
   * <code>.envoy.api.v2.core.ApiConfigSource api_config_source = 2;</code>
   */
  io.envoyproxy.envoy.api.v2.core.ApiConfigSource getApiConfigSource();
  /**
   * <pre>
   * API configuration source.
   * </pre>
   *
   * <code>.envoy.api.v2.core.ApiConfigSource api_config_source = 2;</code>
   */
  io.envoyproxy.envoy.api.v2.core.ApiConfigSourceOrBuilder getApiConfigSourceOrBuilder();

  /**
   * <pre>
   * When set, ADS will be used to fetch resources. The ADS API configuration
   * source in the bootstrap configuration is used.
   * </pre>
   *
   * <code>.envoy.api.v2.core.AggregatedConfigSource ads = 3;</code>
   */
  boolean hasAds();
  /**
   * <pre>
   * When set, ADS will be used to fetch resources. The ADS API configuration
   * source in the bootstrap configuration is used.
   * </pre>
   *
   * <code>.envoy.api.v2.core.AggregatedConfigSource ads = 3;</code>
   */
  io.envoyproxy.envoy.api.v2.core.AggregatedConfigSource getAds();
  /**
   * <pre>
   * When set, ADS will be used to fetch resources. The ADS API configuration
   * source in the bootstrap configuration is used.
   * </pre>
   *
   * <code>.envoy.api.v2.core.AggregatedConfigSource ads = 3;</code>
   */
  io.envoyproxy.envoy.api.v2.core.AggregatedConfigSourceOrBuilder getAdsOrBuilder();

  public io.envoyproxy.envoy.api.v2.core.ConfigSource.ConfigSourceSpecifierCase getConfigSourceSpecifierCase();
}
