// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Determines the set of audio analysis operations to be performed. If unspecified, the Standard AudioAnalysisMode would be chosen.
     * 
     */
    @EnumType
    public enum AudioAnalysisMode {
        /**
         * Performs all operations included in the Basic mode, additionally performing language detection and speaker diarization.
         * 
         */
        Standard("Standard"),
        /**
         * This mode performs speech-to-text transcription and generation of a VTT subtitle/caption file. The output of this mode includes an Insights JSON file including only the keywords, transcription,and timing information. Automatic language detection and speaker diarization are not included in this mode.
         * 
         */
        Basic("Basic");

        private final String value;

        AudioAnalysisMode(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "AudioAnalysisMode[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }