// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.opensearchservice.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DomainSnapshotOptionsArgs extends io.pulumi.resources.ResourceArgs {

    public static final DomainSnapshotOptionsArgs Empty = new DomainSnapshotOptionsArgs();

    @InputImport(name="automatedSnapshotStartHour")
    private final @Nullable Input<Integer> automatedSnapshotStartHour;

    public Input<Integer> getAutomatedSnapshotStartHour() {
        return this.automatedSnapshotStartHour == null ? Input.empty() : this.automatedSnapshotStartHour;
    }

    public DomainSnapshotOptionsArgs(@Nullable Input<Integer> automatedSnapshotStartHour) {
        this.automatedSnapshotStartHour = automatedSnapshotStartHour;
    }

    private DomainSnapshotOptionsArgs() {
        this.automatedSnapshotStartHour = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainSnapshotOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> automatedSnapshotStartHour;

        public Builder() {
    	      // Empty
        }

        public Builder(DomainSnapshotOptionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.automatedSnapshotStartHour = defaults.automatedSnapshotStartHour;
        }

        public Builder setAutomatedSnapshotStartHour(@Nullable Input<Integer> automatedSnapshotStartHour) {
            this.automatedSnapshotStartHour = automatedSnapshotStartHour;
            return this;
        }

        public Builder setAutomatedSnapshotStartHour(@Nullable Integer automatedSnapshotStartHour) {
            this.automatedSnapshotStartHour = Input.ofNullable(automatedSnapshotStartHour);
            return this;
        }

        public DomainSnapshotOptionsArgs build() {
            return new DomainSnapshotOptionsArgs(automatedSnapshotStartHour);
        }
    }
}
