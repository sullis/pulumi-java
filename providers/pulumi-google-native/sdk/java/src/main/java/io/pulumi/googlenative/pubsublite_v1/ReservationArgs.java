// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.pubsublite_v1;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ReservationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ReservationArgs Empty = new ReservationArgs();

    @InputImport(name="location")
      private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * The name of the reservation. Structured like: projects/{project_number}/locations/{location}/reservations/{reservation_id}
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    @InputImport(name="project")
      private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    @InputImport(name="reservationId", required=true)
      private final Input<String> reservationId;

    public Input<String> getReservationId() {
        return this.reservationId;
    }

    /**
     * The reserved throughput capacity. Every unit of throughput capacity is equivalent to 1 MiB/s of published messages or 2 MiB/s of subscribed messages. Any topics which are declared as using capacity from a Reservation will consume resources from this reservation instead of being charged individually.
     * 
     */
    @InputImport(name="throughputCapacity")
      private final @Nullable Input<String> throughputCapacity;

    public Input<String> getThroughputCapacity() {
        return this.throughputCapacity == null ? Input.empty() : this.throughputCapacity;
    }

    public ReservationArgs(
        @Nullable Input<String> location,
        @Nullable Input<String> name,
        @Nullable Input<String> project,
        Input<String> reservationId,
        @Nullable Input<String> throughputCapacity) {
        this.location = location;
        this.name = name;
        this.project = project;
        this.reservationId = Objects.requireNonNull(reservationId, "expected parameter 'reservationId' to be non-null");
        this.throughputCapacity = throughputCapacity;
    }

    private ReservationArgs() {
        this.location = Input.empty();
        this.name = Input.empty();
        this.project = Input.empty();
        this.reservationId = Input.empty();
        this.throughputCapacity = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReservationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> location;
        private @Nullable Input<String> name;
        private @Nullable Input<String> project;
        private Input<String> reservationId;
        private @Nullable Input<String> throughputCapacity;

        public Builder() {
    	      // Empty
        }

        public Builder(ReservationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.reservationId = defaults.reservationId;
    	      this.throughputCapacity = defaults.throughputCapacity;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder setReservationId(Input<String> reservationId) {
            this.reservationId = Objects.requireNonNull(reservationId);
            return this;
        }

        public Builder setReservationId(String reservationId) {
            this.reservationId = Input.of(Objects.requireNonNull(reservationId));
            return this;
        }

        public Builder setThroughputCapacity(@Nullable Input<String> throughputCapacity) {
            this.throughputCapacity = throughputCapacity;
            return this;
        }

        public Builder setThroughputCapacity(@Nullable String throughputCapacity) {
            this.throughputCapacity = Input.ofNullable(throughputCapacity);
            return this;
        }
        public ReservationArgs build() {
            return new ReservationArgs(location, name, project, reservationId, throughputCapacity);
        }
    }
}