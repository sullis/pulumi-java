// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.kubernetes.core_v1.outputs.ExecAction;
import io.pulumi.kubernetes.core_v1.outputs.GRPCAction;
import io.pulumi.kubernetes.core_v1.outputs.HTTPGetAction;
import io.pulumi.kubernetes.core_v1.outputs.TCPSocketAction;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class Probe {
    /**
     * Exec specifies the action to take.
     * 
     */
    private final @Nullable ExecAction exec;
    /**
     * Minimum consecutive failures for the probe to be considered failed after having succeeded. Defaults to 3. Minimum value is 1.
     * 
     */
    private final @Nullable Integer failureThreshold;
    /**
     * GRPC specifies an action involving a GRPC port. This is an alpha field and requires enabling GRPCContainerProbe feature gate.
     * 
     */
    private final @Nullable GRPCAction grpc;
    /**
     * HTTPGet specifies the http request to perform.
     * 
     */
    private final @Nullable HTTPGetAction httpGet;
    /**
     * Number of seconds after the container has started before liveness probes are initiated. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
     * 
     */
    private final @Nullable Integer initialDelaySeconds;
    /**
     * How often (in seconds) to perform the probe. Default to 10 seconds. Minimum value is 1.
     * 
     */
    private final @Nullable Integer periodSeconds;
    /**
     * Minimum consecutive successes for the probe to be considered successful after having failed. Defaults to 1. Must be 1 for liveness and startup. Minimum value is 1.
     * 
     */
    private final @Nullable Integer successThreshold;
    /**
     * TCPSocket specifies an action involving a TCP port.
     * 
     */
    private final @Nullable TCPSocketAction tcpSocket;
    /**
     * Optional duration in seconds the pod needs to terminate gracefully upon probe failure. The grace period is the duration in seconds after the processes running in the pod are sent a termination signal and the time when the processes are forcibly halted with a kill signal. Set this value longer than the expected cleanup time for your process. If this value is nil, the pod's terminationGracePeriodSeconds will be used. Otherwise, this value overrides the value provided by the pod spec. Value must be non-negative integer. The value zero indicates stop immediately via the kill signal (no opportunity to shut down). This is a beta field and requires enabling ProbeTerminationGracePeriod feature gate. Minimum value is 1. spec.terminationGracePeriodSeconds is used if unset.
     * 
     */
    private final @Nullable Integer terminationGracePeriodSeconds;
    /**
     * Number of seconds after which the probe times out. Defaults to 1 second. Minimum value is 1. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
     * 
     */
    private final @Nullable Integer timeoutSeconds;

    @OutputCustomType.Constructor
    private Probe(
        @OutputCustomType.Parameter("exec") @Nullable ExecAction exec,
        @OutputCustomType.Parameter("failureThreshold") @Nullable Integer failureThreshold,
        @OutputCustomType.Parameter("grpc") @Nullable GRPCAction grpc,
        @OutputCustomType.Parameter("httpGet") @Nullable HTTPGetAction httpGet,
        @OutputCustomType.Parameter("initialDelaySeconds") @Nullable Integer initialDelaySeconds,
        @OutputCustomType.Parameter("periodSeconds") @Nullable Integer periodSeconds,
        @OutputCustomType.Parameter("successThreshold") @Nullable Integer successThreshold,
        @OutputCustomType.Parameter("tcpSocket") @Nullable TCPSocketAction tcpSocket,
        @OutputCustomType.Parameter("terminationGracePeriodSeconds") @Nullable Integer terminationGracePeriodSeconds,
        @OutputCustomType.Parameter("timeoutSeconds") @Nullable Integer timeoutSeconds) {
        this.exec = exec;
        this.failureThreshold = failureThreshold;
        this.grpc = grpc;
        this.httpGet = httpGet;
        this.initialDelaySeconds = initialDelaySeconds;
        this.periodSeconds = periodSeconds;
        this.successThreshold = successThreshold;
        this.tcpSocket = tcpSocket;
        this.terminationGracePeriodSeconds = terminationGracePeriodSeconds;
        this.timeoutSeconds = timeoutSeconds;
    }

    /**
     * Exec specifies the action to take.
     * 
    */
    public Optional<ExecAction> getExec() {
        return Optional.ofNullable(this.exec);
    }
    /**
     * Minimum consecutive failures for the probe to be considered failed after having succeeded. Defaults to 3. Minimum value is 1.
     * 
    */
    public Optional<Integer> getFailureThreshold() {
        return Optional.ofNullable(this.failureThreshold);
    }
    /**
     * GRPC specifies an action involving a GRPC port. This is an alpha field and requires enabling GRPCContainerProbe feature gate.
     * 
    */
    public Optional<GRPCAction> getGrpc() {
        return Optional.ofNullable(this.grpc);
    }
    /**
     * HTTPGet specifies the http request to perform.
     * 
    */
    public Optional<HTTPGetAction> getHttpGet() {
        return Optional.ofNullable(this.httpGet);
    }
    /**
     * Number of seconds after the container has started before liveness probes are initiated. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
     * 
    */
    public Optional<Integer> getInitialDelaySeconds() {
        return Optional.ofNullable(this.initialDelaySeconds);
    }
    /**
     * How often (in seconds) to perform the probe. Default to 10 seconds. Minimum value is 1.
     * 
    */
    public Optional<Integer> getPeriodSeconds() {
        return Optional.ofNullable(this.periodSeconds);
    }
    /**
     * Minimum consecutive successes for the probe to be considered successful after having failed. Defaults to 1. Must be 1 for liveness and startup. Minimum value is 1.
     * 
    */
    public Optional<Integer> getSuccessThreshold() {
        return Optional.ofNullable(this.successThreshold);
    }
    /**
     * TCPSocket specifies an action involving a TCP port.
     * 
    */
    public Optional<TCPSocketAction> getTcpSocket() {
        return Optional.ofNullable(this.tcpSocket);
    }
    /**
     * Optional duration in seconds the pod needs to terminate gracefully upon probe failure. The grace period is the duration in seconds after the processes running in the pod are sent a termination signal and the time when the processes are forcibly halted with a kill signal. Set this value longer than the expected cleanup time for your process. If this value is nil, the pod's terminationGracePeriodSeconds will be used. Otherwise, this value overrides the value provided by the pod spec. Value must be non-negative integer. The value zero indicates stop immediately via the kill signal (no opportunity to shut down). This is a beta field and requires enabling ProbeTerminationGracePeriod feature gate. Minimum value is 1. spec.terminationGracePeriodSeconds is used if unset.
     * 
    */
    public Optional<Integer> getTerminationGracePeriodSeconds() {
        return Optional.ofNullable(this.terminationGracePeriodSeconds);
    }
    /**
     * Number of seconds after which the probe times out. Defaults to 1 second. Minimum value is 1. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
     * 
    */
    public Optional<Integer> getTimeoutSeconds() {
        return Optional.ofNullable(this.timeoutSeconds);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(Probe defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ExecAction exec;
        private @Nullable Integer failureThreshold;
        private @Nullable GRPCAction grpc;
        private @Nullable HTTPGetAction httpGet;
        private @Nullable Integer initialDelaySeconds;
        private @Nullable Integer periodSeconds;
        private @Nullable Integer successThreshold;
        private @Nullable TCPSocketAction tcpSocket;
        private @Nullable Integer terminationGracePeriodSeconds;
        private @Nullable Integer timeoutSeconds;

        public Builder() {
    	      // Empty
        }

        public Builder(Probe defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.exec = defaults.exec;
    	      this.failureThreshold = defaults.failureThreshold;
    	      this.grpc = defaults.grpc;
    	      this.httpGet = defaults.httpGet;
    	      this.initialDelaySeconds = defaults.initialDelaySeconds;
    	      this.periodSeconds = defaults.periodSeconds;
    	      this.successThreshold = defaults.successThreshold;
    	      this.tcpSocket = defaults.tcpSocket;
    	      this.terminationGracePeriodSeconds = defaults.terminationGracePeriodSeconds;
    	      this.timeoutSeconds = defaults.timeoutSeconds;
        }

        public Builder setExec(@Nullable ExecAction exec) {
            this.exec = exec;
            return this;
        }

        public Builder setFailureThreshold(@Nullable Integer failureThreshold) {
            this.failureThreshold = failureThreshold;
            return this;
        }

        public Builder setGrpc(@Nullable GRPCAction grpc) {
            this.grpc = grpc;
            return this;
        }

        public Builder setHttpGet(@Nullable HTTPGetAction httpGet) {
            this.httpGet = httpGet;
            return this;
        }

        public Builder setInitialDelaySeconds(@Nullable Integer initialDelaySeconds) {
            this.initialDelaySeconds = initialDelaySeconds;
            return this;
        }

        public Builder setPeriodSeconds(@Nullable Integer periodSeconds) {
            this.periodSeconds = periodSeconds;
            return this;
        }

        public Builder setSuccessThreshold(@Nullable Integer successThreshold) {
            this.successThreshold = successThreshold;
            return this;
        }

        public Builder setTcpSocket(@Nullable TCPSocketAction tcpSocket) {
            this.tcpSocket = tcpSocket;
            return this;
        }

        public Builder setTerminationGracePeriodSeconds(@Nullable Integer terminationGracePeriodSeconds) {
            this.terminationGracePeriodSeconds = terminationGracePeriodSeconds;
            return this;
        }

        public Builder setTimeoutSeconds(@Nullable Integer timeoutSeconds) {
            this.timeoutSeconds = timeoutSeconds;
            return this;
        }
        public Probe build() {
            return new Probe(exec, failureThreshold, grpc, httpGet, initialDelaySeconds, periodSeconds, successThreshold, tcpSocket, terminationGracePeriodSeconds, timeoutSeconds);
        }
    }
}
