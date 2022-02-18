// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.nimblestudio.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * <p>An LDAP attribute of an Active Directory computer account, in the form of a name:value pair.</p>
 * 
 */
public final class StudioComponentActiveDirectoryComputerAttribute extends io.pulumi.resources.InvokeArgs {

    public static final StudioComponentActiveDirectoryComputerAttribute Empty = new StudioComponentActiveDirectoryComputerAttribute();

    /**
     * <p>The name for the LDAP attribute.</p>
     * 
     */
    @InputImport(name="name")
    private final @Nullable String name;

    public Optional<String> getName() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    /**
     * <p>The value for the LDAP attribute.</p>
     * 
     */
    @InputImport(name="value")
    private final @Nullable String value;

    public Optional<String> getValue() {
        return this.value == null ? Optional.empty() : Optional.ofNullable(this.value);
    }

    public StudioComponentActiveDirectoryComputerAttribute(
        @Nullable String name,
        @Nullable String value) {
        this.name = name;
        this.value = value;
    }

    private StudioComponentActiveDirectoryComputerAttribute() {
        this.name = null;
        this.value = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StudioComponentActiveDirectoryComputerAttribute defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String name;
        private @Nullable String value;

        public Builder() {
    	      // Empty
        }

        public Builder(StudioComponentActiveDirectoryComputerAttribute defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.value = defaults.value;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setValue(@Nullable String value) {
            this.value = value;
            return this;
        }

        public StudioComponentActiveDirectoryComputerAttribute build() {
            return new StudioComponentActiveDirectoryComputerAttribute(name, value);
        }
    }
}
