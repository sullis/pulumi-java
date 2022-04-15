// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.elasticsearch.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class GetDomainSnapshotOption {
    /**
     * Hour during which the service takes an automated daily snapshot of the indices in the domain.
     * 
     */
    private final Integer automatedSnapshotStartHour;

    @CustomType.Constructor
    private GetDomainSnapshotOption(@CustomType.Parameter("automatedSnapshotStartHour") Integer automatedSnapshotStartHour) {
        this.automatedSnapshotStartHour = automatedSnapshotStartHour;
    }

    /**
     * Hour during which the service takes an automated daily snapshot of the indices in the domain.
     * 
    */
    public Integer automatedSnapshotStartHour() {
        return this.automatedSnapshotStartHour;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDomainSnapshotOption defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer automatedSnapshotStartHour;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDomainSnapshotOption defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.automatedSnapshotStartHour = defaults.automatedSnapshotStartHour;
        }

        public Builder automatedSnapshotStartHour(Integer automatedSnapshotStartHour) {
            this.automatedSnapshotStartHour = Objects.requireNonNull(automatedSnapshotStartHour);
            return this;
        }        public GetDomainSnapshotOption build() {
            return new GetDomainSnapshotOption(automatedSnapshotStartHour);
        }
    }
}
