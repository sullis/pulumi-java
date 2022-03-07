// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.enums.HeaderActionType;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * An action that can manipulate an http header.
 * 
 */
public final class HeaderActionArgs extends io.pulumi.resources.ResourceArgs {

    public static final HeaderActionArgs Empty = new HeaderActionArgs();

    /**
     * Which type of manipulation to apply to the header.
     * 
     */
    @InputImport(name="headerActionType", required=true)
      private final Input<Either<String,HeaderActionType>> headerActionType;

    public Input<Either<String,HeaderActionType>> getHeaderActionType() {
        return this.headerActionType;
    }

    /**
     * The name of the header this action will apply to.
     * 
     */
    @InputImport(name="headerName", required=true)
      private final Input<String> headerName;

    public Input<String> getHeaderName() {
        return this.headerName;
    }

    /**
     * The value to update the given header name with. This value is not used if the actionType is Delete.
     * 
     */
    @InputImport(name="value")
      private final @Nullable Input<String> value;

    public Input<String> getValue() {
        return this.value == null ? Input.empty() : this.value;
    }

    public HeaderActionArgs(
        Input<Either<String,HeaderActionType>> headerActionType,
        Input<String> headerName,
        @Nullable Input<String> value) {
        this.headerActionType = Objects.requireNonNull(headerActionType, "expected parameter 'headerActionType' to be non-null");
        this.headerName = Objects.requireNonNull(headerName, "expected parameter 'headerName' to be non-null");
        this.value = value;
    }

    private HeaderActionArgs() {
        this.headerActionType = Input.empty();
        this.headerName = Input.empty();
        this.value = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HeaderActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Either<String,HeaderActionType>> headerActionType;
        private Input<String> headerName;
        private @Nullable Input<String> value;

        public Builder() {
    	      // Empty
        }

        public Builder(HeaderActionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.headerActionType = defaults.headerActionType;
    	      this.headerName = defaults.headerName;
    	      this.value = defaults.value;
        }

        public Builder setHeaderActionType(Input<Either<String,HeaderActionType>> headerActionType) {
            this.headerActionType = Objects.requireNonNull(headerActionType);
            return this;
        }

        public Builder setHeaderActionType(Either<String,HeaderActionType> headerActionType) {
            this.headerActionType = Input.of(Objects.requireNonNull(headerActionType));
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

        public Builder setValue(@Nullable Input<String> value) {
            this.value = value;
            return this;
        }

        public Builder setValue(@Nullable String value) {
            this.value = Input.ofNullable(value);
            return this;
        }
        public HeaderActionArgs build() {
            return new HeaderActionArgs(headerActionType, headerName, value);
        }
    }
}