// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.alb.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetListenerPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetListenerPlainArgs Empty = new GetListenerPlainArgs();

    /**
     * ARN of the listener. Required if `load_balancer_arn` and `port` is not set.
     * 
     */
    @Import(name="arn")
    private @Nullable String arn;

    /**
     * @return ARN of the listener. Required if `load_balancer_arn` and `port` is not set.
     * 
     */
    public Optional<String> arn() {
        return Optional.ofNullable(this.arn);
    }

    /**
     * ARN of the load balancer. Required if `arn` is not set.
     * 
     */
    @Import(name="loadBalancerArn")
    private @Nullable String loadBalancerArn;

    /**
     * @return ARN of the load balancer. Required if `arn` is not set.
     * 
     */
    public Optional<String> loadBalancerArn() {
        return Optional.ofNullable(this.loadBalancerArn);
    }

    /**
     * Port of the listener. Required if `arn` is not set.
     * 
     */
    @Import(name="port")
    private @Nullable Integer port;

    /**
     * @return Port of the listener. Required if `arn` is not set.
     * 
     */
    public Optional<Integer> port() {
        return Optional.ofNullable(this.port);
    }

    @Import(name="tags")
    private @Nullable Map<String,String> tags;

    public Optional<Map<String,String>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private GetListenerPlainArgs() {}

    private GetListenerPlainArgs(GetListenerPlainArgs $) {
        this.arn = $.arn;
        this.loadBalancerArn = $.loadBalancerArn;
        this.port = $.port;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetListenerPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetListenerPlainArgs $;

        public Builder() {
            $ = new GetListenerPlainArgs();
        }

        public Builder(GetListenerPlainArgs defaults) {
            $ = new GetListenerPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param arn ARN of the listener. Required if `load_balancer_arn` and `port` is not set.
         * 
         * @return builder
         * 
         */
        public Builder arn(@Nullable String arn) {
            $.arn = arn;
            return this;
        }

        /**
         * @param loadBalancerArn ARN of the load balancer. Required if `arn` is not set.
         * 
         * @return builder
         * 
         */
        public Builder loadBalancerArn(@Nullable String loadBalancerArn) {
            $.loadBalancerArn = loadBalancerArn;
            return this;
        }

        /**
         * @param port Port of the listener. Required if `arn` is not set.
         * 
         * @return builder
         * 
         */
        public Builder port(@Nullable Integer port) {
            $.port = port;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            $.tags = tags;
            return this;
        }

        public GetListenerPlainArgs build() {
            return $;
        }
    }

}
