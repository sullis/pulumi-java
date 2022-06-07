// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_beta.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetReservationArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetReservationArgs Empty = new GetReservationArgs();

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="reservation", required=true)
    private Output<String> reservation;

    public Output<String> reservation() {
        return this.reservation;
    }

    @Import(name="zone", required=true)
    private Output<String> zone;

    public Output<String> zone() {
        return this.zone;
    }

    private GetReservationArgs() {}

    private GetReservationArgs(GetReservationArgs $) {
        this.project = $.project;
        this.reservation = $.reservation;
        this.zone = $.zone;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetReservationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetReservationArgs $;

        public Builder() {
            $ = new GetReservationArgs();
        }

        public Builder(GetReservationArgs defaults) {
            $ = new GetReservationArgs(Objects.requireNonNull(defaults));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public Builder reservation(Output<String> reservation) {
            $.reservation = reservation;
            return this;
        }

        public Builder reservation(String reservation) {
            return reservation(Output.of(reservation));
        }

        public Builder zone(Output<String> zone) {
            $.zone = zone;
            return this;
        }

        public Builder zone(String zone) {
            return zone(Output.of(zone));
        }

        public GetReservationArgs build() {
            $.reservation = Objects.requireNonNull($.reservation, "expected parameter 'reservation' to be non-null");
            $.zone = Objects.requireNonNull($.zone, "expected parameter 'zone' to be non-null");
            return $;
        }
    }

}
