// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.recoveryservices.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Initial replication details.
 * 
 */
public final class InitialReplicationDetailsResponse extends com.pulumi.resources.InvokeArgs {

    public static final InitialReplicationDetailsResponse Empty = new InitialReplicationDetailsResponse();

    /**
     * The initial replication progress percentage.
     * 
     */
    @Import(name="initialReplicationProgressPercentage")
    private @Nullable String initialReplicationProgressPercentage;

    /**
     * @return The initial replication progress percentage.
     * 
     */
    public Optional<String> initialReplicationProgressPercentage() {
        return Optional.ofNullable(this.initialReplicationProgressPercentage);
    }

    /**
     * Initial replication type.
     * 
     */
    @Import(name="initialReplicationType")
    private @Nullable String initialReplicationType;

    /**
     * @return Initial replication type.
     * 
     */
    public Optional<String> initialReplicationType() {
        return Optional.ofNullable(this.initialReplicationType);
    }

    private InitialReplicationDetailsResponse() {}

    private InitialReplicationDetailsResponse(InitialReplicationDetailsResponse $) {
        this.initialReplicationProgressPercentage = $.initialReplicationProgressPercentage;
        this.initialReplicationType = $.initialReplicationType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InitialReplicationDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InitialReplicationDetailsResponse $;

        public Builder() {
            $ = new InitialReplicationDetailsResponse();
        }

        public Builder(InitialReplicationDetailsResponse defaults) {
            $ = new InitialReplicationDetailsResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param initialReplicationProgressPercentage The initial replication progress percentage.
         * 
         * @return builder
         * 
         */
        public Builder initialReplicationProgressPercentage(@Nullable String initialReplicationProgressPercentage) {
            $.initialReplicationProgressPercentage = initialReplicationProgressPercentage;
            return this;
        }

        /**
         * @param initialReplicationType Initial replication type.
         * 
         * @return builder
         * 
         */
        public Builder initialReplicationType(@Nullable String initialReplicationType) {
            $.initialReplicationType = initialReplicationType;
            return this;
        }

        public InitialReplicationDetailsResponse build() {
            return $;
        }
    }

}
