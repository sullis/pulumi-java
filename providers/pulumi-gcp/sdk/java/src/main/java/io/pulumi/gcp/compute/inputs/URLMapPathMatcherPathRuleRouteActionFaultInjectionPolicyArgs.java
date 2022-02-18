// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.gcp.compute.inputs.URLMapPathMatcherPathRuleRouteActionFaultInjectionPolicyAbortArgs;
import io.pulumi.gcp.compute.inputs.URLMapPathMatcherPathRuleRouteActionFaultInjectionPolicyDelayArgs;
import java.util.Objects;
import javax.annotation.Nullable;


public final class URLMapPathMatcherPathRuleRouteActionFaultInjectionPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final URLMapPathMatcherPathRuleRouteActionFaultInjectionPolicyArgs Empty = new URLMapPathMatcherPathRuleRouteActionFaultInjectionPolicyArgs();

    /**
     * The specification for how client requests are aborted as part of fault injection.
     * Structure is documented below.
     * 
     */
    @InputImport(name="abort")
    private final @Nullable Input<URLMapPathMatcherPathRuleRouteActionFaultInjectionPolicyAbortArgs> abort;

    public Input<URLMapPathMatcherPathRuleRouteActionFaultInjectionPolicyAbortArgs> getAbort() {
        return this.abort == null ? Input.empty() : this.abort;
    }

    /**
     * The specification for how client requests are delayed as part of fault injection, before being sent to a backend service.
     * Structure is documented below.
     * 
     */
    @InputImport(name="delay")
    private final @Nullable Input<URLMapPathMatcherPathRuleRouteActionFaultInjectionPolicyDelayArgs> delay;

    public Input<URLMapPathMatcherPathRuleRouteActionFaultInjectionPolicyDelayArgs> getDelay() {
        return this.delay == null ? Input.empty() : this.delay;
    }

    public URLMapPathMatcherPathRuleRouteActionFaultInjectionPolicyArgs(
        @Nullable Input<URLMapPathMatcherPathRuleRouteActionFaultInjectionPolicyAbortArgs> abort,
        @Nullable Input<URLMapPathMatcherPathRuleRouteActionFaultInjectionPolicyDelayArgs> delay) {
        this.abort = abort;
        this.delay = delay;
    }

    private URLMapPathMatcherPathRuleRouteActionFaultInjectionPolicyArgs() {
        this.abort = Input.empty();
        this.delay = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(URLMapPathMatcherPathRuleRouteActionFaultInjectionPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<URLMapPathMatcherPathRuleRouteActionFaultInjectionPolicyAbortArgs> abort;
        private @Nullable Input<URLMapPathMatcherPathRuleRouteActionFaultInjectionPolicyDelayArgs> delay;

        public Builder() {
    	      // Empty
        }

        public Builder(URLMapPathMatcherPathRuleRouteActionFaultInjectionPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.abort = defaults.abort;
    	      this.delay = defaults.delay;
        }

        public Builder setAbort(@Nullable Input<URLMapPathMatcherPathRuleRouteActionFaultInjectionPolicyAbortArgs> abort) {
            this.abort = abort;
            return this;
        }

        public Builder setAbort(@Nullable URLMapPathMatcherPathRuleRouteActionFaultInjectionPolicyAbortArgs abort) {
            this.abort = Input.ofNullable(abort);
            return this;
        }

        public Builder setDelay(@Nullable Input<URLMapPathMatcherPathRuleRouteActionFaultInjectionPolicyDelayArgs> delay) {
            this.delay = delay;
            return this;
        }

        public Builder setDelay(@Nullable URLMapPathMatcherPathRuleRouteActionFaultInjectionPolicyDelayArgs delay) {
            this.delay = Input.ofNullable(delay);
            return this;
        }

        public URLMapPathMatcherPathRuleRouteActionFaultInjectionPolicyArgs build() {
            return new URLMapPathMatcherPathRuleRouteActionFaultInjectionPolicyArgs(abort, delay);
        }
    }
}
