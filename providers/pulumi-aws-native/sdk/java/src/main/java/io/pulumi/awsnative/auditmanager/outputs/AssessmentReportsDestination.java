// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.auditmanager.outputs;

import io.pulumi.awsnative.auditmanager.enums.AssessmentReportDestinationType;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class AssessmentReportsDestination {
    private final @Nullable String destination;
    private final @Nullable AssessmentReportDestinationType destinationType;

    @OutputCustomType.Constructor({"destination","destinationType"})
    private AssessmentReportsDestination(
        @Nullable String destination,
        @Nullable AssessmentReportDestinationType destinationType) {
        this.destination = destination;
        this.destinationType = destinationType;
    }

    public Optional<String> getDestination() {
        return Optional.ofNullable(this.destination);
    }
    public Optional<AssessmentReportDestinationType> getDestinationType() {
        return Optional.ofNullable(this.destinationType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AssessmentReportsDestination defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String destination;
        private @Nullable AssessmentReportDestinationType destinationType;

        public Builder() {
    	      // Empty
        }

        public Builder(AssessmentReportsDestination defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destination = defaults.destination;
    	      this.destinationType = defaults.destinationType;
        }

        public Builder setDestination(@Nullable String destination) {
            this.destination = destination;
            return this;
        }

        public Builder setDestinationType(@Nullable AssessmentReportDestinationType destinationType) {
            this.destinationType = destinationType;
            return this;
        }
        public AssessmentReportsDestination build() {
            return new AssessmentReportsDestination(destination, destinationType);
        }
    }
}