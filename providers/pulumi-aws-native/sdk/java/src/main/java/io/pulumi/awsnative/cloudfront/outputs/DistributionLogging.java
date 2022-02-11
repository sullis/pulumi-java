// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudfront.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DistributionLogging {
    private final String bucket;
    private final @Nullable Boolean includeCookies;
    private final @Nullable String prefix;

    @OutputCustomType.Constructor({"bucket","includeCookies","prefix"})
    private DistributionLogging(
        String bucket,
        @Nullable Boolean includeCookies,
        @Nullable String prefix) {
        this.bucket = Objects.requireNonNull(bucket);
        this.includeCookies = includeCookies;
        this.prefix = prefix;
    }

    public String getBucket() {
        return this.bucket;
    }
    public Optional<Boolean> getIncludeCookies() {
        return Optional.ofNullable(this.includeCookies);
    }
    public Optional<String> getPrefix() {
        return Optional.ofNullable(this.prefix);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DistributionLogging defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String bucket;
        private @Nullable Boolean includeCookies;
        private @Nullable String prefix;

        public Builder() {
    	      // Empty
        }

        public Builder(DistributionLogging defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucket = defaults.bucket;
    	      this.includeCookies = defaults.includeCookies;
    	      this.prefix = defaults.prefix;
        }

        public Builder setBucket(String bucket) {
            this.bucket = Objects.requireNonNull(bucket);
            return this;
        }

        public Builder setIncludeCookies(@Nullable Boolean includeCookies) {
            this.includeCookies = includeCookies;
            return this;
        }

        public Builder setPrefix(@Nullable String prefix) {
            this.prefix = prefix;
            return this;
        }

        public DistributionLogging build() {
            return new DistributionLogging(bucket, includeCookies, prefix);
        }
    }
}
