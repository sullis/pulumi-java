// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.apimanagement.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Body logging settings.
 * 
 */
public final class BodyDiagnosticSettingsArgs extends com.pulumi.resources.ResourceArgs {

    public static final BodyDiagnosticSettingsArgs Empty = new BodyDiagnosticSettingsArgs();

    /**
     * Number of request body bytes to log.
     * 
     */
    @Import(name="bytes")
    private @Nullable Output<Integer> bytes;

    /**
     * @return Number of request body bytes to log.
     * 
     */
    public Optional<Output<Integer>> bytes() {
        return Optional.ofNullable(this.bytes);
    }

    private BodyDiagnosticSettingsArgs() {}

    private BodyDiagnosticSettingsArgs(BodyDiagnosticSettingsArgs $) {
        this.bytes = $.bytes;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BodyDiagnosticSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BodyDiagnosticSettingsArgs $;

        public Builder() {
            $ = new BodyDiagnosticSettingsArgs();
        }

        public Builder(BodyDiagnosticSettingsArgs defaults) {
            $ = new BodyDiagnosticSettingsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param bytes Number of request body bytes to log.
         * 
         * @return builder
         * 
         */
        public Builder bytes(@Nullable Output<Integer> bytes) {
            $.bytes = bytes;
            return this;
        }

        /**
         * @param bytes Number of request body bytes to log.
         * 
         * @return builder
         * 
         */
        public Builder bytes(Integer bytes) {
            return bytes(Output.of(bytes));
        }

        public BodyDiagnosticSettingsArgs build() {
            return $;
        }
    }

}
