// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dlp_v2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dlp_v2.enums.GooglePrivacyDlpV2TimePartConfigPartToExtract;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * For use with `Date`, `Timestamp`, and `TimeOfDay`, extract or preserve a portion of the value.
 * 
 */
public final class GooglePrivacyDlpV2TimePartConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final GooglePrivacyDlpV2TimePartConfigArgs Empty = new GooglePrivacyDlpV2TimePartConfigArgs();

    /**
     * The part of the time to keep.
     * 
     */
    @Import(name="partToExtract")
    private @Nullable Output<GooglePrivacyDlpV2TimePartConfigPartToExtract> partToExtract;

    /**
     * @return The part of the time to keep.
     * 
     */
    public Optional<Output<GooglePrivacyDlpV2TimePartConfigPartToExtract>> partToExtract() {
        return Optional.ofNullable(this.partToExtract);
    }

    private GooglePrivacyDlpV2TimePartConfigArgs() {}

    private GooglePrivacyDlpV2TimePartConfigArgs(GooglePrivacyDlpV2TimePartConfigArgs $) {
        this.partToExtract = $.partToExtract;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GooglePrivacyDlpV2TimePartConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GooglePrivacyDlpV2TimePartConfigArgs $;

        public Builder() {
            $ = new GooglePrivacyDlpV2TimePartConfigArgs();
        }

        public Builder(GooglePrivacyDlpV2TimePartConfigArgs defaults) {
            $ = new GooglePrivacyDlpV2TimePartConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param partToExtract The part of the time to keep.
         * 
         * @return builder
         * 
         */
        public Builder partToExtract(@Nullable Output<GooglePrivacyDlpV2TimePartConfigPartToExtract> partToExtract) {
            $.partToExtract = partToExtract;
            return this;
        }

        /**
         * @param partToExtract The part of the time to keep.
         * 
         * @return builder
         * 
         */
        public Builder partToExtract(GooglePrivacyDlpV2TimePartConfigPartToExtract partToExtract) {
            return partToExtract(Output.of(partToExtract));
        }

        public GooglePrivacyDlpV2TimePartConfigArgs build() {
            return $;
        }
    }

}
