// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appmesh.inputs;

import com.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerTimeoutHttpIdleArgs;
import com.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerTimeoutHttpPerRequestArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VirtualNodeSpecListenerTimeoutHttpArgs extends com.pulumi.resources.ResourceArgs {

    public static final VirtualNodeSpecListenerTimeoutHttpArgs Empty = new VirtualNodeSpecListenerTimeoutHttpArgs();

    /**
     * The idle timeout. An idle timeout bounds the amount of time that a connection may be idle.
     * 
     */
    @Import(name="idle")
    private @Nullable Output<VirtualNodeSpecListenerTimeoutHttpIdleArgs> idle;

    /**
     * @return The idle timeout. An idle timeout bounds the amount of time that a connection may be idle.
     * 
     */
    public Optional<Output<VirtualNodeSpecListenerTimeoutHttpIdleArgs>> idle() {
        return Optional.ofNullable(this.idle);
    }

    /**
     * The per request timeout.
     * 
     */
    @Import(name="perRequest")
    private @Nullable Output<VirtualNodeSpecListenerTimeoutHttpPerRequestArgs> perRequest;

    /**
     * @return The per request timeout.
     * 
     */
    public Optional<Output<VirtualNodeSpecListenerTimeoutHttpPerRequestArgs>> perRequest() {
        return Optional.ofNullable(this.perRequest);
    }

    private VirtualNodeSpecListenerTimeoutHttpArgs() {}

    private VirtualNodeSpecListenerTimeoutHttpArgs(VirtualNodeSpecListenerTimeoutHttpArgs $) {
        this.idle = $.idle;
        this.perRequest = $.perRequest;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VirtualNodeSpecListenerTimeoutHttpArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VirtualNodeSpecListenerTimeoutHttpArgs $;

        public Builder() {
            $ = new VirtualNodeSpecListenerTimeoutHttpArgs();
        }

        public Builder(VirtualNodeSpecListenerTimeoutHttpArgs defaults) {
            $ = new VirtualNodeSpecListenerTimeoutHttpArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param idle The idle timeout. An idle timeout bounds the amount of time that a connection may be idle.
         * 
         * @return builder
         * 
         */
        public Builder idle(@Nullable Output<VirtualNodeSpecListenerTimeoutHttpIdleArgs> idle) {
            $.idle = idle;
            return this;
        }

        /**
         * @param idle The idle timeout. An idle timeout bounds the amount of time that a connection may be idle.
         * 
         * @return builder
         * 
         */
        public Builder idle(VirtualNodeSpecListenerTimeoutHttpIdleArgs idle) {
            return idle(Output.of(idle));
        }

        /**
         * @param perRequest The per request timeout.
         * 
         * @return builder
         * 
         */
        public Builder perRequest(@Nullable Output<VirtualNodeSpecListenerTimeoutHttpPerRequestArgs> perRequest) {
            $.perRequest = perRequest;
            return this;
        }

        /**
         * @param perRequest The per request timeout.
         * 
         * @return builder
         * 
         */
        public Builder perRequest(VirtualNodeSpecListenerTimeoutHttpPerRequestArgs perRequest) {
            return perRequest(Output.of(perRequest));
        }

        public VirtualNodeSpecListenerTimeoutHttpArgs build() {
            return $;
        }
    }

}
