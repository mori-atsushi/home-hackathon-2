package domain

import (
	"github.com/google/uuid"
)

type User struct {
	ID   string
	Name string
}

func NewUser(name string) User {
	return User{
		ID:   uuid.Must(uuid.NewRandom()).String(),
		Name: name,
	}
}