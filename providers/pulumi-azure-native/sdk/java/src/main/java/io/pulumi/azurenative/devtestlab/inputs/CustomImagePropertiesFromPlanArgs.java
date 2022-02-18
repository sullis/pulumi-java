// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devtestlab.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Properties for plan on a custom image.
 * 
 */
public final class CustomImagePropertiesFromPlanArgs extends io.pulumi.resources.ResourceArgs {

    public static final CustomImagePropertiesFromPlanArgs Empty = new CustomImagePropertiesFromPlanArgs();

    /**
     * The id of the plan, equivalent to name of the plan
     * 
     */
    @InputImport(name="id")
    private final @Nullable Input<String> id;

    public Input<String> getId() {
        return this.id == null ? Input.empty() : this.id;
    }

    /**
     * The offer for the plan from the marketplace image the custom image is derived from
     * 
     */
    @InputImport(name="offer")
    private final @Nullable Input<String> offer;

    public Input<String> getOffer() {
        return this.offer == null ? Input.empty() : this.offer;
    }

    /**
     * The publisher for the plan from the marketplace image the custom image is derived from
     * 
     */
    @InputImport(name="publisher")
    private final @Nullable Input<String> publisher;

    public Input<String> getPublisher() {
        return this.publisher == null ? Input.empty() : this.publisher;
    }

    public CustomImagePropertiesFromPlanArgs(
        @Nullable Input<String> id,
        @Nullable Input<String> offer,
        @Nullable Input<String> publisher) {
        this.id = id;
        this.offer = offer;
        this.publisher = publisher;
    }

    private CustomImagePropertiesFromPlanArgs() {
        this.id = Input.empty();
        this.offer = Input.empty();
        this.publisher = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomImagePropertiesFromPlanArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> id;
        private @Nullable Input<String> offer;
        private @Nullable Input<String> publisher;

        public Builder() {
    	      // Empty
        }

        public Builder(CustomImagePropertiesFromPlanArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.offer = defaults.offer;
    	      this.publisher = defaults.publisher;
        }

        public Builder setId(@Nullable Input<String> id) {
            this.id = id;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = Input.ofNullable(id);
            return this;
        }

        public Builder setOffer(@Nullable Input<String> offer) {
            this.offer = offer;
            return this;
        }

        public Builder setOffer(@Nullable String offer) {
            this.offer = Input.ofNullable(offer);
            return this;
        }

        public Builder setPublisher(@Nullable Input<String> publisher) {
            this.publisher = publisher;
            return this;
        }

        public Builder setPublisher(@Nullable String publisher) {
            this.publisher = Input.ofNullable(publisher);
            return this;
        }

        public CustomImagePropertiesFromPlanArgs build() {
            return new CustomImagePropertiesFromPlanArgs(id, offer, publisher);
        }
    }
}
