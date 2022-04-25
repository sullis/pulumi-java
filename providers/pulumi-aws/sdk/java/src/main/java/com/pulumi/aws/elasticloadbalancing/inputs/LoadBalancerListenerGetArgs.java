// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.elasticloadbalancing.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LoadBalancerListenerGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final LoadBalancerListenerGetArgs Empty = new LoadBalancerListenerGetArgs();

    /**
     * The port on the instance to route to
     * 
     */
    @Import(name="instancePort", required=true)
    private Output<Integer> instancePort;

    /**
     * @return The port on the instance to route to
     * 
     */
    public Output<Integer> instancePort() {
        return this.instancePort;
    }

    /**
     * The protocol to use to the instance. Valid
     * values are `HTTP`, `HTTPS`, `TCP`, or `SSL`
     * 
     */
    @Import(name="instanceProtocol", required=true)
    private Output<String> instanceProtocol;

    /**
     * @return The protocol to use to the instance. Valid
     * values are `HTTP`, `HTTPS`, `TCP`, or `SSL`
     * 
     */
    public Output<String> instanceProtocol() {
        return this.instanceProtocol;
    }

    /**
     * The port to listen on for the load balancer
     * 
     */
    @Import(name="lbPort", required=true)
    private Output<Integer> lbPort;

    /**
     * @return The port to listen on for the load balancer
     * 
     */
    public Output<Integer> lbPort() {
        return this.lbPort;
    }

    /**
     * The protocol to listen on. Valid values are `HTTP`,
     * `HTTPS`, `TCP`, or `SSL`
     * 
     */
    @Import(name="lbProtocol", required=true)
    private Output<String> lbProtocol;

    /**
     * @return The protocol to listen on. Valid values are `HTTP`,
     * `HTTPS`, `TCP`, or `SSL`
     * 
     */
    public Output<String> lbProtocol() {
        return this.lbProtocol;
    }

    /**
     * The ARN of an SSL certificate you have
     * uploaded to AWS IAM. **Note ECDSA-specific restrictions below.  Only valid when `lb_protocol` is either HTTPS or SSL**
     * 
     */
    @Import(name="sslCertificateId")
    private @Nullable Output<String> sslCertificateId;

    /**
     * @return The ARN of an SSL certificate you have
     * uploaded to AWS IAM. **Note ECDSA-specific restrictions below.  Only valid when `lb_protocol` is either HTTPS or SSL**
     * 
     */
    public Optional<Output<String>> sslCertificateId() {
        return Optional.ofNullable(this.sslCertificateId);
    }

    private LoadBalancerListenerGetArgs() {}

    private LoadBalancerListenerGetArgs(LoadBalancerListenerGetArgs $) {
        this.instancePort = $.instancePort;
        this.instanceProtocol = $.instanceProtocol;
        this.lbPort = $.lbPort;
        this.lbProtocol = $.lbProtocol;
        this.sslCertificateId = $.sslCertificateId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LoadBalancerListenerGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LoadBalancerListenerGetArgs $;

        public Builder() {
            $ = new LoadBalancerListenerGetArgs();
        }

        public Builder(LoadBalancerListenerGetArgs defaults) {
            $ = new LoadBalancerListenerGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param instancePort The port on the instance to route to
         * 
         * @return builder
         * 
         */
        public Builder instancePort(Output<Integer> instancePort) {
            $.instancePort = instancePort;
            return this;
        }

        /**
         * @param instancePort The port on the instance to route to
         * 
         * @return builder
         * 
         */
        public Builder instancePort(Integer instancePort) {
            return instancePort(Output.of(instancePort));
        }

        /**
         * @param instanceProtocol The protocol to use to the instance. Valid
         * values are `HTTP`, `HTTPS`, `TCP`, or `SSL`
         * 
         * @return builder
         * 
         */
        public Builder instanceProtocol(Output<String> instanceProtocol) {
            $.instanceProtocol = instanceProtocol;
            return this;
        }

        /**
         * @param instanceProtocol The protocol to use to the instance. Valid
         * values are `HTTP`, `HTTPS`, `TCP`, or `SSL`
         * 
         * @return builder
         * 
         */
        public Builder instanceProtocol(String instanceProtocol) {
            return instanceProtocol(Output.of(instanceProtocol));
        }

        /**
         * @param lbPort The port to listen on for the load balancer
         * 
         * @return builder
         * 
         */
        public Builder lbPort(Output<Integer> lbPort) {
            $.lbPort = lbPort;
            return this;
        }

        /**
         * @param lbPort The port to listen on for the load balancer
         * 
         * @return builder
         * 
         */
        public Builder lbPort(Integer lbPort) {
            return lbPort(Output.of(lbPort));
        }

        /**
         * @param lbProtocol The protocol to listen on. Valid values are `HTTP`,
         * `HTTPS`, `TCP`, or `SSL`
         * 
         * @return builder
         * 
         */
        public Builder lbProtocol(Output<String> lbProtocol) {
            $.lbProtocol = lbProtocol;
            return this;
        }

        /**
         * @param lbProtocol The protocol to listen on. Valid values are `HTTP`,
         * `HTTPS`, `TCP`, or `SSL`
         * 
         * @return builder
         * 
         */
        public Builder lbProtocol(String lbProtocol) {
            return lbProtocol(Output.of(lbProtocol));
        }

        /**
         * @param sslCertificateId The ARN of an SSL certificate you have
         * uploaded to AWS IAM. **Note ECDSA-specific restrictions below.  Only valid when `lb_protocol` is either HTTPS or SSL**
         * 
         * @return builder
         * 
         */
        public Builder sslCertificateId(@Nullable Output<String> sslCertificateId) {
            $.sslCertificateId = sslCertificateId;
            return this;
        }

        /**
         * @param sslCertificateId The ARN of an SSL certificate you have
         * uploaded to AWS IAM. **Note ECDSA-specific restrictions below.  Only valid when `lb_protocol` is either HTTPS or SSL**
         * 
         * @return builder
         * 
         */
        public Builder sslCertificateId(String sslCertificateId) {
            return sslCertificateId(Output.of(sslCertificateId));
        }

        public LoadBalancerListenerGetArgs build() {
            $.instancePort = Objects.requireNonNull($.instancePort, "expected parameter 'instancePort' to be non-null");
            $.instanceProtocol = Objects.requireNonNull($.instanceProtocol, "expected parameter 'instanceProtocol' to be non-null");
            $.lbPort = Objects.requireNonNull($.lbPort, "expected parameter 'lbPort' to be non-null");
            $.lbProtocol = Objects.requireNonNull($.lbProtocol, "expected parameter 'lbProtocol' to be non-null");
            return $;
        }
    }

}
