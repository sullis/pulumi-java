// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.labservices.inputs;

import com.pulumi.azurenative.labservices.enums.EnableState;
import com.pulumi.azurenative.labservices.enums.ShutdownOnIdleMode;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Profile for how to handle shutting down virtual machines.
 * 
 */
public final class AutoShutdownProfileArgs extends com.pulumi.resources.ResourceArgs {

    public static final AutoShutdownProfileArgs Empty = new AutoShutdownProfileArgs();

    /**
     * The amount of time a VM will stay running after a user disconnects if this behavior is enabled.
     * 
     */
    @Import(name="disconnectDelay")
    private @Nullable Output<String> disconnectDelay;

    /**
     * @return The amount of time a VM will stay running after a user disconnects if this behavior is enabled.
     * 
     */
    public Optional<Output<String>> disconnectDelay() {
        return Optional.ofNullable(this.disconnectDelay);
    }

    /**
     * The amount of time a VM will idle before it is shutdown if this behavior is enabled.
     * 
     */
    @Import(name="idleDelay")
    private @Nullable Output<String> idleDelay;

    /**
     * @return The amount of time a VM will idle before it is shutdown if this behavior is enabled.
     * 
     */
    public Optional<Output<String>> idleDelay() {
        return Optional.ofNullable(this.idleDelay);
    }

    /**
     * The amount of time a VM will stay running before it is shutdown if no connection is made and this behavior is enabled.
     * 
     */
    @Import(name="noConnectDelay")
    private @Nullable Output<String> noConnectDelay;

    /**
     * @return The amount of time a VM will stay running before it is shutdown if no connection is made and this behavior is enabled.
     * 
     */
    public Optional<Output<String>> noConnectDelay() {
        return Optional.ofNullable(this.noConnectDelay);
    }

    /**
     * Whether shutdown on disconnect is enabled
     * 
     */
    @Import(name="shutdownOnDisconnect")
    private @Nullable Output<EnableState> shutdownOnDisconnect;

    /**
     * @return Whether shutdown on disconnect is enabled
     * 
     */
    public Optional<Output<EnableState>> shutdownOnDisconnect() {
        return Optional.ofNullable(this.shutdownOnDisconnect);
    }

    /**
     * Whether a VM will get shutdown when it has idled for a period of time.
     * 
     */
    @Import(name="shutdownOnIdle")
    private @Nullable Output<ShutdownOnIdleMode> shutdownOnIdle;

    /**
     * @return Whether a VM will get shutdown when it has idled for a period of time.
     * 
     */
    public Optional<Output<ShutdownOnIdleMode>> shutdownOnIdle() {
        return Optional.ofNullable(this.shutdownOnIdle);
    }

    /**
     * Whether a VM will get shutdown when it hasn&#39;t been connected to after a period of time.
     * 
     */
    @Import(name="shutdownWhenNotConnected")
    private @Nullable Output<EnableState> shutdownWhenNotConnected;

    /**
     * @return Whether a VM will get shutdown when it hasn&#39;t been connected to after a period of time.
     * 
     */
    public Optional<Output<EnableState>> shutdownWhenNotConnected() {
        return Optional.ofNullable(this.shutdownWhenNotConnected);
    }

    private AutoShutdownProfileArgs() {}

    private AutoShutdownProfileArgs(AutoShutdownProfileArgs $) {
        this.disconnectDelay = $.disconnectDelay;
        this.idleDelay = $.idleDelay;
        this.noConnectDelay = $.noConnectDelay;
        this.shutdownOnDisconnect = $.shutdownOnDisconnect;
        this.shutdownOnIdle = $.shutdownOnIdle;
        this.shutdownWhenNotConnected = $.shutdownWhenNotConnected;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AutoShutdownProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AutoShutdownProfileArgs $;

        public Builder() {
            $ = new AutoShutdownProfileArgs();
        }

        public Builder(AutoShutdownProfileArgs defaults) {
            $ = new AutoShutdownProfileArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param disconnectDelay The amount of time a VM will stay running after a user disconnects if this behavior is enabled.
         * 
         * @return builder
         * 
         */
        public Builder disconnectDelay(@Nullable Output<String> disconnectDelay) {
            $.disconnectDelay = disconnectDelay;
            return this;
        }

        /**
         * @param disconnectDelay The amount of time a VM will stay running after a user disconnects if this behavior is enabled.
         * 
         * @return builder
         * 
         */
        public Builder disconnectDelay(String disconnectDelay) {
            return disconnectDelay(Output.of(disconnectDelay));
        }

        /**
         * @param idleDelay The amount of time a VM will idle before it is shutdown if this behavior is enabled.
         * 
         * @return builder
         * 
         */
        public Builder idleDelay(@Nullable Output<String> idleDelay) {
            $.idleDelay = idleDelay;
            return this;
        }

        /**
         * @param idleDelay The amount of time a VM will idle before it is shutdown if this behavior is enabled.
         * 
         * @return builder
         * 
         */
        public Builder idleDelay(String idleDelay) {
            return idleDelay(Output.of(idleDelay));
        }

        /**
         * @param noConnectDelay The amount of time a VM will stay running before it is shutdown if no connection is made and this behavior is enabled.
         * 
         * @return builder
         * 
         */
        public Builder noConnectDelay(@Nullable Output<String> noConnectDelay) {
            $.noConnectDelay = noConnectDelay;
            return this;
        }

        /**
         * @param noConnectDelay The amount of time a VM will stay running before it is shutdown if no connection is made and this behavior is enabled.
         * 
         * @return builder
         * 
         */
        public Builder noConnectDelay(String noConnectDelay) {
            return noConnectDelay(Output.of(noConnectDelay));
        }

        /**
         * @param shutdownOnDisconnect Whether shutdown on disconnect is enabled
         * 
         * @return builder
         * 
         */
        public Builder shutdownOnDisconnect(@Nullable Output<EnableState> shutdownOnDisconnect) {
            $.shutdownOnDisconnect = shutdownOnDisconnect;
            return this;
        }

        /**
         * @param shutdownOnDisconnect Whether shutdown on disconnect is enabled
         * 
         * @return builder
         * 
         */
        public Builder shutdownOnDisconnect(EnableState shutdownOnDisconnect) {
            return shutdownOnDisconnect(Output.of(shutdownOnDisconnect));
        }

        /**
         * @param shutdownOnIdle Whether a VM will get shutdown when it has idled for a period of time.
         * 
         * @return builder
         * 
         */
        public Builder shutdownOnIdle(@Nullable Output<ShutdownOnIdleMode> shutdownOnIdle) {
            $.shutdownOnIdle = shutdownOnIdle;
            return this;
        }

        /**
         * @param shutdownOnIdle Whether a VM will get shutdown when it has idled for a period of time.
         * 
         * @return builder
         * 
         */
        public Builder shutdownOnIdle(ShutdownOnIdleMode shutdownOnIdle) {
            return shutdownOnIdle(Output.of(shutdownOnIdle));
        }

        /**
         * @param shutdownWhenNotConnected Whether a VM will get shutdown when it hasn&#39;t been connected to after a period of time.
         * 
         * @return builder
         * 
         */
        public Builder shutdownWhenNotConnected(@Nullable Output<EnableState> shutdownWhenNotConnected) {
            $.shutdownWhenNotConnected = shutdownWhenNotConnected;
            return this;
        }

        /**
         * @param shutdownWhenNotConnected Whether a VM will get shutdown when it hasn&#39;t been connected to after a period of time.
         * 
         * @return builder
         * 
         */
        public Builder shutdownWhenNotConnected(EnableState shutdownWhenNotConnected) {
            return shutdownWhenNotConnected(Output.of(shutdownWhenNotConnected));
        }

        public AutoShutdownProfileArgs build() {
            $.shutdownOnDisconnect = Codegen.objectProp("shutdownOnDisconnect", EnableState.class).output().arg($.shutdownOnDisconnect).def(EnableState.Disabled).getNullable();
            $.shutdownOnIdle = Codegen.objectProp("shutdownOnIdle", ShutdownOnIdleMode.class).output().arg($.shutdownOnIdle).def(ShutdownOnIdleMode.None).getNullable();
            $.shutdownWhenNotConnected = Codegen.objectProp("shutdownWhenNotConnected", EnableState.class).output().arg($.shutdownWhenNotConnected).def(EnableState.Disabled).getNullable();
            return $;
        }
    }

}
