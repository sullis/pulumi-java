// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.lb.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class TargetGroupStickiness {
    /**
     * Only used when the type is `lb_cookie`. The time period, in seconds, during which requests from a client should be routed to the same target. After this time period expires, the load balancer-generated cookie is considered stale. The range is 1 second to 1 week (604800 seconds). The default value is 1 day (86400 seconds).
     * 
     */
    private final @Nullable Integer cookieDuration;
    /**
     * Name of the application based cookie. AWSALB, AWSALBAPP, and AWSALBTG prefixes are reserved and cannot be used. Only needed when type is `app_cookie`.
     * 
     */
    private final @Nullable String cookieName;
    /**
     * Boolean to enable / disable `stickiness`. Default is `true`.
     * 
     */
    private final @Nullable Boolean enabled;
    /**
     * The type of sticky sessions. The only current possible values are `lb_cookie`, `app_cookie` for ALBs, and `source_ip` for NLBs.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private TargetGroupStickiness(
        @CustomType.Parameter("cookieDuration") @Nullable Integer cookieDuration,
        @CustomType.Parameter("cookieName") @Nullable String cookieName,
        @CustomType.Parameter("enabled") @Nullable Boolean enabled,
        @CustomType.Parameter("type") String type) {
        this.cookieDuration = cookieDuration;
        this.cookieName = cookieName;
        this.enabled = enabled;
        this.type = type;
    }

    /**
     * Only used when the type is `lb_cookie`. The time period, in seconds, during which requests from a client should be routed to the same target. After this time period expires, the load balancer-generated cookie is considered stale. The range is 1 second to 1 week (604800 seconds). The default value is 1 day (86400 seconds).
     * 
    */
    public Optional<Integer> cookieDuration() {
        return Optional.ofNullable(this.cookieDuration);
    }
    /**
     * Name of the application based cookie. AWSALB, AWSALBAPP, and AWSALBTG prefixes are reserved and cannot be used. Only needed when type is `app_cookie`.
     * 
    */
    public Optional<String> cookieName() {
        return Optional.ofNullable(this.cookieName);
    }
    /**
     * Boolean to enable / disable `stickiness`. Default is `true`.
     * 
    */
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }
    /**
     * The type of sticky sessions. The only current possible values are `lb_cookie`, `app_cookie` for ALBs, and `source_ip` for NLBs.
     * 
    */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TargetGroupStickiness defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer cookieDuration;
        private @Nullable String cookieName;
        private @Nullable Boolean enabled;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(TargetGroupStickiness defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cookieDuration = defaults.cookieDuration;
    	      this.cookieName = defaults.cookieName;
    	      this.enabled = defaults.enabled;
    	      this.type = defaults.type;
        }

        public Builder cookieDuration(@Nullable Integer cookieDuration) {
            this.cookieDuration = cookieDuration;
            return this;
        }
        public Builder cookieName(@Nullable String cookieName) {
            this.cookieName = cookieName;
            return this;
        }
        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public TargetGroupStickiness build() {
            return new TargetGroupStickiness(cookieDuration, cookieName, enabled, type);
        }
    }
}
