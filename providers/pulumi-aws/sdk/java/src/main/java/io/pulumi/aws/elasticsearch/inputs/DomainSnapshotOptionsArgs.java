// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.elasticsearch.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;


public final class DomainSnapshotOptionsArgs extends io.pulumi.resources.ResourceArgs {

    public static final DomainSnapshotOptionsArgs Empty = new DomainSnapshotOptionsArgs();

    /**
     * Hour during which the service takes an automated daily snapshot of the indices in the domain.
     * 
     */
    @Import(name="automatedSnapshotStartHour", required=true)
      private final Output<Integer> automatedSnapshotStartHour;

    public Output<Integer> getAutomatedSnapshotStartHour() {
        return this.automatedSnapshotStartHour;
    }

    public DomainSnapshotOptionsArgs(Output<Integer> automatedSnapshotStartHour) {
        this.automatedSnapshotStartHour = Objects.requireNonNull(automatedSnapshotStartHour, "expected parameter 'automatedSnapshotStartHour' to be non-null");
    }

    private DomainSnapshotOptionsArgs() {
        this.automatedSnapshotStartHour = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainSnapshotOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Integer> automatedSnapshotStartHour;

        public Builder() {
    	      // Empty
        }

        public Builder(DomainSnapshotOptionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.automatedSnapshotStartHour = defaults.automatedSnapshotStartHour;
        }

        public Builder automatedSnapshotStartHour(Output<Integer> automatedSnapshotStartHour) {
            this.automatedSnapshotStartHour = Objects.requireNonNull(automatedSnapshotStartHour);
            return this;
        }
        public Builder automatedSnapshotStartHour(Integer automatedSnapshotStartHour) {
            this.automatedSnapshotStartHour = Output.of(Objects.requireNonNull(automatedSnapshotStartHour));
            return this;
        }        public DomainSnapshotOptionsArgs build() {
            return new DomainSnapshotOptionsArgs(automatedSnapshotStartHour);
        }
    }
}
