// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.amplify.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class DomainSubDomainSetting {
    private final String branchName;
    private final String prefix;

    @CustomType.Constructor
    private DomainSubDomainSetting(
        @CustomType.Parameter("branchName") String branchName,
        @CustomType.Parameter("prefix") String prefix) {
        this.branchName = branchName;
        this.prefix = prefix;
    }

    public String branchName() {
        return this.branchName;
    }
    public String prefix() {
        return this.prefix;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainSubDomainSetting defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String branchName;
        private String prefix;

        public Builder() {
    	      // Empty
        }

        public Builder(DomainSubDomainSetting defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.branchName = defaults.branchName;
    	      this.prefix = defaults.prefix;
        }

        public Builder branchName(String branchName) {
            this.branchName = Objects.requireNonNull(branchName);
            return this;
        }
        public Builder prefix(String prefix) {
            this.prefix = Objects.requireNonNull(prefix);
            return this;
        }        public DomainSubDomainSetting build() {
            return new DomainSubDomainSetting(branchName, prefix);
        }
    }
}
