// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetFutureReservationPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetFutureReservationPlainArgs Empty = new GetFutureReservationPlainArgs();

    @Import(name="futureReservation", required=true)
    private String futureReservation;

    public String futureReservation() {
        return this.futureReservation;
    }

    @Import(name="project")
    private @Nullable String project;

    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="zone", required=true)
    private String zone;

    public String zone() {
        return this.zone;
    }

    private GetFutureReservationPlainArgs() {}

    private GetFutureReservationPlainArgs(GetFutureReservationPlainArgs $) {
        this.futureReservation = $.futureReservation;
        this.project = $.project;
        this.zone = $.zone;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetFutureReservationPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetFutureReservationPlainArgs $;

        public Builder() {
            $ = new GetFutureReservationPlainArgs();
        }

        public Builder(GetFutureReservationPlainArgs defaults) {
            $ = new GetFutureReservationPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder futureReservation(String futureReservation) {
            $.futureReservation = futureReservation;
            return this;
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public Builder zone(String zone) {
            $.zone = zone;
            return this;
        }

        public GetFutureReservationPlainArgs build() {
            $.futureReservation = Objects.requireNonNull($.futureReservation, "expected parameter 'futureReservation' to be non-null");
            $.zone = Objects.requireNonNull($.zone, "expected parameter 'zone' to be non-null");
            return $;
        }
    }

}
