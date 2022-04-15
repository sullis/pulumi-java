// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.route53recoveryreadiness.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ResourceSetR53ResourceRecord {
    /**
     * The DNS target domain name.
     * 
     */
    private final @Nullable String domainName;
    /**
     * The Resource Record set id.
     * 
     */
    private final @Nullable String recordSetId;

    @CustomType.Constructor
    private ResourceSetR53ResourceRecord(
        @CustomType.Parameter("domainName") @Nullable String domainName,
        @CustomType.Parameter("recordSetId") @Nullable String recordSetId) {
        this.domainName = domainName;
        this.recordSetId = recordSetId;
    }

    /**
     * The DNS target domain name.
     * 
    */
    public Optional<String> domainName() {
        return Optional.ofNullable(this.domainName);
    }
    /**
     * The Resource Record set id.
     * 
    */
    public Optional<String> recordSetId() {
        return Optional.ofNullable(this.recordSetId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceSetR53ResourceRecord defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String domainName;
        private @Nullable String recordSetId;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceSetR53ResourceRecord defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.domainName = defaults.domainName;
    	      this.recordSetId = defaults.recordSetId;
        }

        public Builder domainName(@Nullable String domainName) {
            this.domainName = domainName;
            return this;
        }
        public Builder recordSetId(@Nullable String recordSetId) {
            this.recordSetId = recordSetId;
            return this;
        }        public ResourceSetR53ResourceRecord build() {
            return new ResourceSetR53ResourceRecord(domainName, recordSetId);
        }
    }
}
