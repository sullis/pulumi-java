// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.containerinstance.inputs;

import com.pulumi.azurenative.containerinstance.inputs.ContainerExecResponse;
import com.pulumi.azurenative.containerinstance.inputs.ContainerHttpGetResponse;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The container probe, for liveness or readiness
 * 
 */
public final class ContainerProbeResponse extends com.pulumi.resources.InvokeArgs {

    public static final ContainerProbeResponse Empty = new ContainerProbeResponse();

    /**
     * The execution command to probe
     * 
     */
    @Import(name="exec")
    private @Nullable ContainerExecResponse exec;

    /**
     * @return The execution command to probe
     * 
     */
    public Optional<ContainerExecResponse> exec() {
        return Optional.ofNullable(this.exec);
    }

    /**
     * The failure threshold.
     * 
     */
    @Import(name="failureThreshold")
    private @Nullable Integer failureThreshold;

    /**
     * @return The failure threshold.
     * 
     */
    public Optional<Integer> failureThreshold() {
        return Optional.ofNullable(this.failureThreshold);
    }

    /**
     * The Http Get settings to probe
     * 
     */
    @Import(name="httpGet")
    private @Nullable ContainerHttpGetResponse httpGet;

    /**
     * @return The Http Get settings to probe
     * 
     */
    public Optional<ContainerHttpGetResponse> httpGet() {
        return Optional.ofNullable(this.httpGet);
    }

    /**
     * The initial delay seconds.
     * 
     */
    @Import(name="initialDelaySeconds")
    private @Nullable Integer initialDelaySeconds;

    /**
     * @return The initial delay seconds.
     * 
     */
    public Optional<Integer> initialDelaySeconds() {
        return Optional.ofNullable(this.initialDelaySeconds);
    }

    /**
     * The period seconds.
     * 
     */
    @Import(name="periodSeconds")
    private @Nullable Integer periodSeconds;

    /**
     * @return The period seconds.
     * 
     */
    public Optional<Integer> periodSeconds() {
        return Optional.ofNullable(this.periodSeconds);
    }

    /**
     * The success threshold.
     * 
     */
    @Import(name="successThreshold")
    private @Nullable Integer successThreshold;

    /**
     * @return The success threshold.
     * 
     */
    public Optional<Integer> successThreshold() {
        return Optional.ofNullable(this.successThreshold);
    }

    /**
     * The timeout seconds.
     * 
     */
    @Import(name="timeoutSeconds")
    private @Nullable Integer timeoutSeconds;

    /**
     * @return The timeout seconds.
     * 
     */
    public Optional<Integer> timeoutSeconds() {
        return Optional.ofNullable(this.timeoutSeconds);
    }

    private ContainerProbeResponse() {}

    private ContainerProbeResponse(ContainerProbeResponse $) {
        this.exec = $.exec;
        this.failureThreshold = $.failureThreshold;
        this.httpGet = $.httpGet;
        this.initialDelaySeconds = $.initialDelaySeconds;
        this.periodSeconds = $.periodSeconds;
        this.successThreshold = $.successThreshold;
        this.timeoutSeconds = $.timeoutSeconds;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ContainerProbeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ContainerProbeResponse $;

        public Builder() {
            $ = new ContainerProbeResponse();
        }

        public Builder(ContainerProbeResponse defaults) {
            $ = new ContainerProbeResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param exec The execution command to probe
         * 
         * @return builder
         * 
         */
        public Builder exec(@Nullable ContainerExecResponse exec) {
            $.exec = exec;
            return this;
        }

        /**
         * @param failureThreshold The failure threshold.
         * 
         * @return builder
         * 
         */
        public Builder failureThreshold(@Nullable Integer failureThreshold) {
            $.failureThreshold = failureThreshold;
            return this;
        }

        /**
         * @param httpGet The Http Get settings to probe
         * 
         * @return builder
         * 
         */
        public Builder httpGet(@Nullable ContainerHttpGetResponse httpGet) {
            $.httpGet = httpGet;
            return this;
        }

        /**
         * @param initialDelaySeconds The initial delay seconds.
         * 
         * @return builder
         * 
         */
        public Builder initialDelaySeconds(@Nullable Integer initialDelaySeconds) {
            $.initialDelaySeconds = initialDelaySeconds;
            return this;
        }

        /**
         * @param periodSeconds The period seconds.
         * 
         * @return builder
         * 
         */
        public Builder periodSeconds(@Nullable Integer periodSeconds) {
            $.periodSeconds = periodSeconds;
            return this;
        }

        /**
         * @param successThreshold The success threshold.
         * 
         * @return builder
         * 
         */
        public Builder successThreshold(@Nullable Integer successThreshold) {
            $.successThreshold = successThreshold;
            return this;
        }

        /**
         * @param timeoutSeconds The timeout seconds.
         * 
         * @return builder
         * 
         */
        public Builder timeoutSeconds(@Nullable Integer timeoutSeconds) {
            $.timeoutSeconds = timeoutSeconds;
            return this;
        }

        public ContainerProbeResponse build() {
            return $;
        }
    }

}
