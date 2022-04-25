// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.run_v1alpha1.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.run_v1alpha1.inputs.ExecActionResponse;
import com.pulumi.googlenative.run_v1alpha1.inputs.HTTPGetActionResponse;
import com.pulumi.googlenative.run_v1alpha1.inputs.TCPSocketActionResponse;
import java.lang.Integer;
import java.util.Objects;


/**
 * Not supported by Cloud Run Probe describes a health check to be performed against a container to determine whether it is alive or ready to receive traffic.
 * 
 */
public final class ProbeResponse extends com.pulumi.resources.InvokeArgs {

    public static final ProbeResponse Empty = new ProbeResponse();

    /**
     * (Optional) One and only one of the following should be specified. Exec specifies the action to take. A field inlined from the Handler message.
     * 
     */
    @Import(name="exec", required=true)
    private ExecActionResponse exec;

    /**
     * @return (Optional) One and only one of the following should be specified. Exec specifies the action to take. A field inlined from the Handler message.
     * 
     */
    public ExecActionResponse exec() {
        return this.exec;
    }

    /**
     * (Optional) Minimum consecutive failures for the probe to be considered failed after having succeeded. Defaults to 3. Minimum value is 1.
     * 
     */
    @Import(name="failureThreshold", required=true)
    private Integer failureThreshold;

    /**
     * @return (Optional) Minimum consecutive failures for the probe to be considered failed after having succeeded. Defaults to 3. Minimum value is 1.
     * 
     */
    public Integer failureThreshold() {
        return this.failureThreshold;
    }

    /**
     * (Optional) HTTPGet specifies the http request to perform. A field inlined from the Handler message.
     * 
     */
    @Import(name="httpGet", required=true)
    private HTTPGetActionResponse httpGet;

    /**
     * @return (Optional) HTTPGet specifies the http request to perform. A field inlined from the Handler message.
     * 
     */
    public HTTPGetActionResponse httpGet() {
        return this.httpGet;
    }

    /**
     * (Optional) Number of seconds after the container has started before liveness probes are initiated. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
     * 
     */
    @Import(name="initialDelaySeconds", required=true)
    private Integer initialDelaySeconds;

    /**
     * @return (Optional) Number of seconds after the container has started before liveness probes are initiated. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
     * 
     */
    public Integer initialDelaySeconds() {
        return this.initialDelaySeconds;
    }

    /**
     * (Optional) How often (in seconds) to perform the probe. Default to 10 seconds. Minimum value is 1.
     * 
     */
    @Import(name="periodSeconds", required=true)
    private Integer periodSeconds;

    /**
     * @return (Optional) How often (in seconds) to perform the probe. Default to 10 seconds. Minimum value is 1.
     * 
     */
    public Integer periodSeconds() {
        return this.periodSeconds;
    }

    /**
     * (Optional) Minimum consecutive successes for the probe to be considered successful after having failed. Defaults to 1. Must be 1 for liveness. Minimum value is 1.
     * 
     */
    @Import(name="successThreshold", required=true)
    private Integer successThreshold;

    /**
     * @return (Optional) Minimum consecutive successes for the probe to be considered successful after having failed. Defaults to 1. Must be 1 for liveness. Minimum value is 1.
     * 
     */
    public Integer successThreshold() {
        return this.successThreshold;
    }

    /**
     * (Optional) TCPSocket specifies an action involving a TCP port. TCP hooks not yet supported A field inlined from the Handler message.
     * 
     */
    @Import(name="tcpSocket", required=true)
    private TCPSocketActionResponse tcpSocket;

    /**
     * @return (Optional) TCPSocket specifies an action involving a TCP port. TCP hooks not yet supported A field inlined from the Handler message.
     * 
     */
    public TCPSocketActionResponse tcpSocket() {
        return this.tcpSocket;
    }

    /**
     * (Optional) Number of seconds after which the probe times out. Defaults to 1 second. Minimum value is 1. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
     * 
     */
    @Import(name="timeoutSeconds", required=true)
    private Integer timeoutSeconds;

    /**
     * @return (Optional) Number of seconds after which the probe times out. Defaults to 1 second. Minimum value is 1. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
     * 
     */
    public Integer timeoutSeconds() {
        return this.timeoutSeconds;
    }

    private ProbeResponse() {}

    private ProbeResponse(ProbeResponse $) {
        this.exec = $.exec;
        this.failureThreshold = $.failureThreshold;
        this.httpGet = $.httpGet;
        this.initialDelaySeconds = $.initialDelaySeconds;
        this.periodSeconds = $.periodSeconds;
        this.successThreshold = $.successThreshold;
        this.tcpSocket = $.tcpSocket;
        this.timeoutSeconds = $.timeoutSeconds;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ProbeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ProbeResponse $;

        public Builder() {
            $ = new ProbeResponse();
        }

        public Builder(ProbeResponse defaults) {
            $ = new ProbeResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param exec (Optional) One and only one of the following should be specified. Exec specifies the action to take. A field inlined from the Handler message.
         * 
         * @return builder
         * 
         */
        public Builder exec(ExecActionResponse exec) {
            $.exec = exec;
            return this;
        }

        /**
         * @param failureThreshold (Optional) Minimum consecutive failures for the probe to be considered failed after having succeeded. Defaults to 3. Minimum value is 1.
         * 
         * @return builder
         * 
         */
        public Builder failureThreshold(Integer failureThreshold) {
            $.failureThreshold = failureThreshold;
            return this;
        }

        /**
         * @param httpGet (Optional) HTTPGet specifies the http request to perform. A field inlined from the Handler message.
         * 
         * @return builder
         * 
         */
        public Builder httpGet(HTTPGetActionResponse httpGet) {
            $.httpGet = httpGet;
            return this;
        }

        /**
         * @param initialDelaySeconds (Optional) Number of seconds after the container has started before liveness probes are initiated. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
         * 
         * @return builder
         * 
         */
        public Builder initialDelaySeconds(Integer initialDelaySeconds) {
            $.initialDelaySeconds = initialDelaySeconds;
            return this;
        }

        /**
         * @param periodSeconds (Optional) How often (in seconds) to perform the probe. Default to 10 seconds. Minimum value is 1.
         * 
         * @return builder
         * 
         */
        public Builder periodSeconds(Integer periodSeconds) {
            $.periodSeconds = periodSeconds;
            return this;
        }

        /**
         * @param successThreshold (Optional) Minimum consecutive successes for the probe to be considered successful after having failed. Defaults to 1. Must be 1 for liveness. Minimum value is 1.
         * 
         * @return builder
         * 
         */
        public Builder successThreshold(Integer successThreshold) {
            $.successThreshold = successThreshold;
            return this;
        }

        /**
         * @param tcpSocket (Optional) TCPSocket specifies an action involving a TCP port. TCP hooks not yet supported A field inlined from the Handler message.
         * 
         * @return builder
         * 
         */
        public Builder tcpSocket(TCPSocketActionResponse tcpSocket) {
            $.tcpSocket = tcpSocket;
            return this;
        }

        /**
         * @param timeoutSeconds (Optional) Number of seconds after which the probe times out. Defaults to 1 second. Minimum value is 1. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
         * 
         * @return builder
         * 
         */
        public Builder timeoutSeconds(Integer timeoutSeconds) {
            $.timeoutSeconds = timeoutSeconds;
            return this;
        }

        public ProbeResponse build() {
            $.exec = Objects.requireNonNull($.exec, "expected parameter 'exec' to be non-null");
            $.failureThreshold = Objects.requireNonNull($.failureThreshold, "expected parameter 'failureThreshold' to be non-null");
            $.httpGet = Objects.requireNonNull($.httpGet, "expected parameter 'httpGet' to be non-null");
            $.initialDelaySeconds = Objects.requireNonNull($.initialDelaySeconds, "expected parameter 'initialDelaySeconds' to be non-null");
            $.periodSeconds = Objects.requireNonNull($.periodSeconds, "expected parameter 'periodSeconds' to be non-null");
            $.successThreshold = Objects.requireNonNull($.successThreshold, "expected parameter 'successThreshold' to be non-null");
            $.tcpSocket = Objects.requireNonNull($.tcpSocket, "expected parameter 'tcpSocket' to be non-null");
            $.timeoutSeconds = Objects.requireNonNull($.timeoutSeconds, "expected parameter 'timeoutSeconds' to be non-null");
            return $;
        }
    }

}
