// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.azurenative.web.enums.CookieExpirationConvention;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The configuration settings of the session cookie's expiration.
 * 
 */
public final class CookieExpirationArgs extends io.pulumi.resources.ResourceArgs {

    public static final CookieExpirationArgs Empty = new CookieExpirationArgs();

    /**
     * The convention used when determining the session cookie's expiration.
     * 
     */
    @Import(name="convention")
      private final @Nullable Output<CookieExpirationConvention> convention;

    public Output<CookieExpirationConvention> getConvention() {
        return this.convention == null ? Output.empty() : this.convention;
    }

    /**
     * The time after the request is made when the session cookie should expire.
     * 
     */
    @Import(name="timeToExpiration")
      private final @Nullable Output<String> timeToExpiration;

    public Output<String> getTimeToExpiration() {
        return this.timeToExpiration == null ? Output.empty() : this.timeToExpiration;
    }

    public CookieExpirationArgs(
        @Nullable Output<CookieExpirationConvention> convention,
        @Nullable Output<String> timeToExpiration) {
        this.convention = convention;
        this.timeToExpiration = timeToExpiration;
    }

    private CookieExpirationArgs() {
        this.convention = Output.empty();
        this.timeToExpiration = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CookieExpirationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<CookieExpirationConvention> convention;
        private @Nullable Output<String> timeToExpiration;

        public Builder() {
    	      // Empty
        }

        public Builder(CookieExpirationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.convention = defaults.convention;
    	      this.timeToExpiration = defaults.timeToExpiration;
        }

        public Builder convention(@Nullable Output<CookieExpirationConvention> convention) {
            this.convention = convention;
            return this;
        }
        public Builder convention(@Nullable CookieExpirationConvention convention) {
            this.convention = Output.ofNullable(convention);
            return this;
        }
        public Builder timeToExpiration(@Nullable Output<String> timeToExpiration) {
            this.timeToExpiration = timeToExpiration;
            return this;
        }
        public Builder timeToExpiration(@Nullable String timeToExpiration) {
            this.timeToExpiration = Output.ofNullable(timeToExpiration);
            return this;
        }        public CookieExpirationArgs build() {
            return new CookieExpirationArgs(convention, timeToExpiration);
        }
    }
}
