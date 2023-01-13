package com.mcwpaths.kikoz.objects;

import net.minecraft.util.StringRepresentable;

public enum Filled implements StringRepresentable
{

	EMPTY("empty"),
	GRAVEL("gravel");


    private final String name;

    Filled(final String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return this.name;
    }

	public String getString() {
	      return this.name;
	}

	public String getSerializedName() {
	      return this.name;
	}
} 