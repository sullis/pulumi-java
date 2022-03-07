// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The built-in preset to be used for encoding videos.
     * 
     */
    @EnumType
    public enum EncoderNamedPreset {
        /**
         * Produces an MP4 file where the video is encoded with H.264 codec at 2200 kbps and a picture height of 480 pixels, and the stereo audio is encoded with AAC-LC codec at 128 kbps.
         * 
         */
        H264SingleBitrateSD("H264SingleBitrateSD"),
        /**
         * Produces an MP4 file where the video is encoded with H.264 codec at 4500 kbps and a picture height of 720 pixels, and the stereo audio is encoded with AAC-LC codec at 128 kbps.
         * 
         */
        H264SingleBitrate720p("H264SingleBitrate720p"),
        /**
         * Produces an MP4 file where the video is encoded with H.264 codec at 6750 kbps and a picture height of 1080 pixels, and the stereo audio is encoded with AAC-LC codec at 128 kbps.
         * 
         */
        H264SingleBitrate1080p("H264SingleBitrate1080p"),
        /**
         * Produces a set of GOP aligned MP4 files with H.264 video and stereo AAC audio. Auto-generates a bitrate ladder based on the input resolution, bitrate and frame rate. The auto-generated preset will never exceed the input resolution. For example, if the input is 720p, output will remain 720p at best.
         * 
         */
        AdaptiveStreaming("AdaptiveStreaming"),
        /**
         * Produces a single MP4 file containing only stereo audio encoded at 192 kbps.
         * 
         */
        AACGoodQualityAudio("AACGoodQualityAudio"),
        /**
         * Exposes an experimental preset for content-aware encoding. Given any input content, the service attempts to automatically determine the optimal number of layers, appropriate bitrate and resolution settings for delivery by adaptive streaming. The underlying algorithms will continue to evolve over time. The output will contain MP4 files with video and audio interleaved.
         * 
         */
        ContentAwareEncodingExperimental("ContentAwareEncodingExperimental"),
        /**
         * Produces a set of GOP-aligned MP4s by using content-aware encoding. Given any input content, the service performs an initial lightweight analysis of the input content, and uses the results to determine the optimal number of layers, appropriate bitrate and resolution settings for delivery by adaptive streaming. This preset is particularly effective for low and medium complexity videos, where the output files will be at lower bitrates but at a quality that still delivers a good experience to viewers. The output will contain MP4 files with video and audio interleaved.
         * 
         */
        ContentAwareEncoding("ContentAwareEncoding"),
        /**
         * Copy all video and audio streams from the input asset as non-interleaved video and audio output files. This preset can be used to clip an existing asset or convert a group of key frame (GOP) aligned MP4 files as an asset that can be streamed.
         * 
         */
        CopyAllBitrateNonInterleaved("CopyAllBitrateNonInterleaved"),
        /**
         * Produces a set of 8 GOP-aligned MP4 files, ranging from 6000 kbps to 400 kbps, and stereo AAC audio. Resolution starts at 1080p and goes down to 180p.
         * 
         */
        H264MultipleBitrate1080p("H264MultipleBitrate1080p"),
        /**
         * Produces a set of 6 GOP-aligned MP4 files, ranging from 3400 kbps to 400 kbps, and stereo AAC audio. Resolution starts at 720p and goes down to 180p.
         * 
         */
        H264MultipleBitrate720p("H264MultipleBitrate720p"),
        /**
         * Produces a set of 5 GOP-aligned MP4 files, ranging from 1900kbps to 400 kbps, and stereo AAC audio. Resolution starts at 480p and goes down to 240p.
         * 
         */
        H264MultipleBitrateSD("H264MultipleBitrateSD"),
        /**
         * Produces a set of GOP-aligned MP4s by using content-aware encoding. Given any input content, the service performs an initial lightweight analysis of the input content, and uses the results to determine the optimal number of layers, appropriate bitrate and resolution settings for delivery by adaptive streaming. This preset is particularly effective for low and medium complexity videos, where the output files will be at lower bitrates but at a quality that still delivers a good experience to viewers. The output will contain MP4 files with video and audio interleaved.
         * 
         */
        H265ContentAwareEncoding("H265ContentAwareEncoding"),
        /**
         * Produces a set of GOP aligned MP4 files with H.265 video and stereo AAC audio. Auto-generates a bitrate ladder based on the input resolution, bitrate and frame rate. The auto-generated preset will never exceed the input resolution. For example, if the input is 720p, output will remain 720p at best.
         * 
         */
        H265AdaptiveStreaming("H265AdaptiveStreaming"),
        /**
         * Produces an MP4 file where the video is encoded with H.265 codec at 1800 kbps and a picture height of 720 pixels, and the stereo audio is encoded with AAC-LC codec at 128 kbps.
         * 
         */
        H265SingleBitrate720p("H265SingleBitrate720p"),
        /**
         * Produces an MP4 file where the video is encoded with H.265 codec at 3500 kbps and a picture height of 1080 pixels, and the stereo audio is encoded with AAC-LC codec at 128 kbps.
         * 
         */
        H265SingleBitrate1080p("H265SingleBitrate1080p"),
        /**
         * Produces an MP4 file where the video is encoded with H.265 codec at 9500 kbps and a picture height of 2160 pixels, and the stereo audio is encoded with AAC-LC codec at 128 kbps.
         * 
         */
        H265SingleBitrate4K("H265SingleBitrate4K");

        private final String value;

        EncoderNamedPreset(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "EncoderNamedPreset[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }