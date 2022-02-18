// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.automation.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The connection type property associated with the entity.
 * 
 */
public final class ConnectionTypeAssociationPropertyArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConnectionTypeAssociationPropertyArgs Empty = new ConnectionTypeAssociationPropertyArgs();

    /**
     * Gets or sets the name of the connection type.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    public ConnectionTypeAssociationPropertyArgs(@Nullable Input<String> name) {
        this.name = name;
    }

    private ConnectionTypeAssociationPropertyArgs() {
        this.name = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectionTypeAssociationPropertyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectionTypeAssociationPropertyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public ConnectionTypeAssociationPropertyArgs build() {
            return new ConnectionTypeAssociationPropertyArgs(name);
        }
    }
}
