// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.elasticloadbalancing.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetLoadBalancerPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetLoadBalancerPlainArgs Empty = new GetLoadBalancerPlainArgs();

    /**
     * The unique name of the load balancer.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The unique name of the load balancer.
     * 
     */
    public String name() {
        return this.name;
    }

    @Import(name="tags")
    private @Nullable Map<String,String> tags;

    public Optional<Map<String,String>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private GetLoadBalancerPlainArgs() {}

    private GetLoadBalancerPlainArgs(GetLoadBalancerPlainArgs $) {
        this.name = $.name;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetLoadBalancerPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetLoadBalancerPlainArgs $;

        public Builder() {
            $ = new GetLoadBalancerPlainArgs();
        }

        public Builder(GetLoadBalancerPlainArgs defaults) {
            $ = new GetLoadBalancerPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The unique name of the load balancer.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            $.tags = tags;
            return this;
        }

        public GetLoadBalancerPlainArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
