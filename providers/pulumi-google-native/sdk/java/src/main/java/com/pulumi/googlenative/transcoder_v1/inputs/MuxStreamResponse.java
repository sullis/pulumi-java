// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.transcoder_v1.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.transcoder_v1.inputs.SegmentSettingsResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Multiplexing settings for output stream.
 * 
 */
public final class MuxStreamResponse extends com.pulumi.resources.InvokeArgs {

    public static final MuxStreamResponse Empty = new MuxStreamResponse();

    /**
     * The container format. The default is `mp4` Supported container formats: - `ts` - `fmp4`- the corresponding file extension is `.m4s` - `mp4` - `vtt`
     * 
     */
    @Import(name="container", required=true)
    private String container;

    /**
     * @return The container format. The default is `mp4` Supported container formats: - `ts` - `fmp4`- the corresponding file extension is `.m4s` - `mp4` - `vtt`
     * 
     */
    public String container() {
        return this.container;
    }

    /**
     * List of `ElementaryStream.key`s multiplexed in this stream.
     * 
     */
    @Import(name="elementaryStreams", required=true)
    private List<String> elementaryStreams;

    /**
     * @return List of `ElementaryStream.key`s multiplexed in this stream.
     * 
     */
    public List<String> elementaryStreams() {
        return this.elementaryStreams;
    }

    /**
     * The name of the generated file. The default is `MuxStream.key` with the extension suffix corresponding to the `MuxStream.container`. Individual segments also have an incremental 10-digit zero-padded suffix starting from 0 before the extension, such as `mux_stream0000000123.ts`.
     * 
     */
    @Import(name="fileName", required=true)
    private String fileName;

    /**
     * @return The name of the generated file. The default is `MuxStream.key` with the extension suffix corresponding to the `MuxStream.container`. Individual segments also have an incremental 10-digit zero-padded suffix starting from 0 before the extension, such as `mux_stream0000000123.ts`.
     * 
     */
    public String fileName() {
        return this.fileName;
    }

    /**
     * A unique key for this multiplexed stream. HLS media manifests will be named `MuxStream.key` with the `.m3u8` extension suffix.
     * 
     */
    @Import(name="key", required=true)
    private String key;

    /**
     * @return A unique key for this multiplexed stream. HLS media manifests will be named `MuxStream.key` with the `.m3u8` extension suffix.
     * 
     */
    public String key() {
        return this.key;
    }

    /**
     * Segment settings for `ts`, `fmp4` and `vtt`.
     * 
     */
    @Import(name="segmentSettings", required=true)
    private SegmentSettingsResponse segmentSettings;

    /**
     * @return Segment settings for `ts`, `fmp4` and `vtt`.
     * 
     */
    public SegmentSettingsResponse segmentSettings() {
        return this.segmentSettings;
    }

    private MuxStreamResponse() {}

    private MuxStreamResponse(MuxStreamResponse $) {
        this.container = $.container;
        this.elementaryStreams = $.elementaryStreams;
        this.fileName = $.fileName;
        this.key = $.key;
        this.segmentSettings = $.segmentSettings;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MuxStreamResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MuxStreamResponse $;

        public Builder() {
            $ = new MuxStreamResponse();
        }

        public Builder(MuxStreamResponse defaults) {
            $ = new MuxStreamResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param container The container format. The default is `mp4` Supported container formats: - `ts` - `fmp4`- the corresponding file extension is `.m4s` - `mp4` - `vtt`
         * 
         * @return builder
         * 
         */
        public Builder container(String container) {
            $.container = container;
            return this;
        }

        /**
         * @param elementaryStreams List of `ElementaryStream.key`s multiplexed in this stream.
         * 
         * @return builder
         * 
         */
        public Builder elementaryStreams(List<String> elementaryStreams) {
            $.elementaryStreams = elementaryStreams;
            return this;
        }

        /**
         * @param elementaryStreams List of `ElementaryStream.key`s multiplexed in this stream.
         * 
         * @return builder
         * 
         */
        public Builder elementaryStreams(String... elementaryStreams) {
            return elementaryStreams(List.of(elementaryStreams));
        }

        /**
         * @param fileName The name of the generated file. The default is `MuxStream.key` with the extension suffix corresponding to the `MuxStream.container`. Individual segments also have an incremental 10-digit zero-padded suffix starting from 0 before the extension, such as `mux_stream0000000123.ts`.
         * 
         * @return builder
         * 
         */
        public Builder fileName(String fileName) {
            $.fileName = fileName;
            return this;
        }

        /**
         * @param key A unique key for this multiplexed stream. HLS media manifests will be named `MuxStream.key` with the `.m3u8` extension suffix.
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            $.key = key;
            return this;
        }

        /**
         * @param segmentSettings Segment settings for `ts`, `fmp4` and `vtt`.
         * 
         * @return builder
         * 
         */
        public Builder segmentSettings(SegmentSettingsResponse segmentSettings) {
            $.segmentSettings = segmentSettings;
            return this;
        }

        public MuxStreamResponse build() {
            $.container = Objects.requireNonNull($.container, "expected parameter 'container' to be non-null");
            $.elementaryStreams = Objects.requireNonNull($.elementaryStreams, "expected parameter 'elementaryStreams' to be non-null");
            $.fileName = Objects.requireNonNull($.fileName, "expected parameter 'fileName' to be non-null");
            $.key = Objects.requireNonNull($.key, "expected parameter 'key' to be non-null");
            $.segmentSettings = Objects.requireNonNull($.segmentSettings, "expected parameter 'segmentSettings' to be non-null");
            return $;
        }
    }

}
