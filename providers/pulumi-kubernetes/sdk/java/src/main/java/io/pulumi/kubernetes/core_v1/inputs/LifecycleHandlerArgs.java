// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.kubernetes.core_v1.inputs.ExecActionArgs;
import io.pulumi.kubernetes.core_v1.inputs.HTTPGetActionArgs;
import io.pulumi.kubernetes.core_v1.inputs.TCPSocketActionArgs;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * LifecycleHandler defines a specific action that should be taken in a lifecycle hook. One and only one of the fields, except TCPSocket must be specified.
 * 
 */
public final class LifecycleHandlerArgs extends io.pulumi.resources.ResourceArgs {

    public static final LifecycleHandlerArgs Empty = new LifecycleHandlerArgs();

    /**
     * Exec specifies the action to take.
     * 
     */
    @InputImport(name="exec")
    private final @Nullable Input<ExecActionArgs> exec;

    public Input<ExecActionArgs> getExec() {
        return this.exec == null ? Input.empty() : this.exec;
    }

    /**
     * HTTPGet specifies the http request to perform.
     * 
     */
    @InputImport(name="httpGet")
    private final @Nullable Input<HTTPGetActionArgs> httpGet;

    public Input<HTTPGetActionArgs> getHttpGet() {
        return this.httpGet == null ? Input.empty() : this.httpGet;
    }

    /**
     * Deprecated. TCPSocket is NOT supported as a LifecycleHandler and kept for the backward compatibility. There are no validation of this field and lifecycle hooks will fail in runtime when tcp handler is specified.
     * 
     */
    @InputImport(name="tcpSocket")
    private final @Nullable Input<TCPSocketActionArgs> tcpSocket;

    public Input<TCPSocketActionArgs> getTcpSocket() {
        return this.tcpSocket == null ? Input.empty() : this.tcpSocket;
    }

    public LifecycleHandlerArgs(
        @Nullable Input<ExecActionArgs> exec,
        @Nullable Input<HTTPGetActionArgs> httpGet,
        @Nullable Input<TCPSocketActionArgs> tcpSocket) {
        this.exec = exec;
        this.httpGet = httpGet;
        this.tcpSocket = tcpSocket;
    }

    private LifecycleHandlerArgs() {
        this.exec = Input.empty();
        this.httpGet = Input.empty();
        this.tcpSocket = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LifecycleHandlerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ExecActionArgs> exec;
        private @Nullable Input<HTTPGetActionArgs> httpGet;
        private @Nullable Input<TCPSocketActionArgs> tcpSocket;

        public Builder() {
    	      // Empty
        }

        public Builder(LifecycleHandlerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.exec = defaults.exec;
    	      this.httpGet = defaults.httpGet;
    	      this.tcpSocket = defaults.tcpSocket;
        }

        public Builder setExec(@Nullable Input<ExecActionArgs> exec) {
            this.exec = exec;
            return this;
        }

        public Builder setExec(@Nullable ExecActionArgs exec) {
            this.exec = Input.ofNullable(exec);
            return this;
        }

        public Builder setHttpGet(@Nullable Input<HTTPGetActionArgs> httpGet) {
            this.httpGet = httpGet;
            return this;
        }

        public Builder setHttpGet(@Nullable HTTPGetActionArgs httpGet) {
            this.httpGet = Input.ofNullable(httpGet);
            return this;
        }

        public Builder setTcpSocket(@Nullable Input<TCPSocketActionArgs> tcpSocket) {
            this.tcpSocket = tcpSocket;
            return this;
        }

        public Builder setTcpSocket(@Nullable TCPSocketActionArgs tcpSocket) {
            this.tcpSocket = Input.ofNullable(tcpSocket);
            return this;
        }

        public LifecycleHandlerArgs build() {
            return new LifecycleHandlerArgs(exec, httpGet, tcpSocket);
        }
    }
}
