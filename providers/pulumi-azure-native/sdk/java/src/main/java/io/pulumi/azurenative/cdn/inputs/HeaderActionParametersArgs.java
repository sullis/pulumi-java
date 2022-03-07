// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cdn.inputs;

import io.pulumi.azurenative.cdn.enums.HeaderAction;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Defines the parameters for the request header action.
 * 
 */
public final class HeaderActionParametersArgs extends io.pulumi.resources.ResourceArgs {

    public static final HeaderActionParametersArgs Empty = new HeaderActionParametersArgs();

    /**
     * Action to perform
     * 
     */
    @InputImport(name="headerAction", required=true)
      private final Input<Either<String,HeaderAction>> headerAction;

    public Input<Either<String,HeaderAction>> getHeaderAction() {
        return this.headerAction;
    }

    /**
     * Name of the header to modify
     * 
     */
    @InputImport(name="headerName", required=true)
      private final Input<String> headerName;

    public Input<String> getHeaderName() {
        return this.headerName;
    }

    @InputImport(name="odataType", required=true)
      private final Input<String> odataType;

    public Input<String> getOdataType() {
        return this.odataType;
    }

    /**
     * Value for the specified action
     * 
     */
    @InputImport(name="value")
      private final @Nullable Input<String> value;

    public Input<String> getValue() {
        return this.value == null ? Input.empty() : this.value;
    }

    public HeaderActionParametersArgs(
        Input<Either<String,HeaderAction>> headerAction,
        Input<String> headerName,
        Input<String> odataType,
        @Nullable Input<String> value) {
        this.headerAction = Objects.requireNonNull(headerAction, "expected parameter 'headerAction' to be non-null");
        this.headerName = Objects.requireNonNull(headerName, "expected parameter 'headerName' to be non-null");
        this.odataType = Objects.requireNonNull(odataType, "expected parameter 'odataType' to be non-null");
        this.value = value;
    }

    private HeaderActionParametersArgs() {
        this.headerAction = Input.empty();
        this.headerName = Input.empty();
        this.odataType = Input.empty();
        this.value = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HeaderActionParametersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Either<String,HeaderAction>> headerAction;
        private Input<String> headerName;
        private Input<String> odataType;
        private @Nullable Input<String> value;

        public Builder() {
    	      // Empty
        }

        public Builder(HeaderActionParametersArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.headerAction = defaults.headerAction;
    	      this.headerName = defaults.headerName;
    	      this.odataType = defaults.odataType;
    	      this.value = defaults.value;
        }

        public Builder setHeaderAction(Input<Either<String,HeaderAction>> headerAction) {
            this.headerAction = Objects.requireNonNull(headerAction);
            return this;
        }

        public Builder setHeaderAction(Either<String,HeaderAction> headerAction) {
            this.headerAction = Input.of(Objects.requireNonNull(headerAction));
            return this;
        }

        public Builder setHeaderName(Input<String> headerName) {
            this.headerName = Objects.requireNonNull(headerName);
            return this;
        }

        public Builder setHeaderName(String headerName) {
            this.headerName = Input.of(Objects.requireNonNull(headerName));
            return this;
        }

        public Builder setOdataType(Input<String> odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }

        public Builder setOdataType(String odataType) {
            this.odataType = Input.of(Objects.requireNonNull(odataType));
            return this;
        }

        public Builder setValue(@Nullable Input<String> value) {
            this.value = value;
            return this;
        }

        public Builder setValue(@Nullable String value) {
            this.value = Input.ofNullable(value);
            return this;
        }
        public HeaderActionParametersArgs build() {
            return new HeaderActionParametersArgs(headerAction, headerName, odataType, value);
        }
    }
}